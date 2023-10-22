package ru.jira.kotlin.plugin.demo.event

import com.atlassian.event.api.EventListener
import com.atlassian.event.api.EventPublisher
import com.atlassian.plugin.event.events.PluginEnabledEvent
import com.atlassian.sal.api.lifecycle.LifecycleAware
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.DisposableBean
import org.springframework.beans.factory.InitializingBean
import ru.jira.kotlin.plugin.demo.service.PluginStartService
import java.util.EnumSet

open class PluginEventListener(private val eventPublisher: EventPublisher,
                               private val pluginStartServices: List<PluginStartService>
) : InitializingBean, DisposableBean, LifecycleAware {

    private val lifecycleEvents: EnumSet<PluginState> = EnumSet.noneOf(PluginState::class.java)

    companion object {
        @JvmStatic
        private val LOGGER: Logger = LoggerFactory.getLogger(PluginEventListener::class.java)
        @JvmStatic
        private val PLUGIN_KEY: String = "ru.jira.kotlin.plugin.demo.jira-kotlin-plugin-demo"
    }

    @EventListener
    open fun onPluginEnableEvent(pluginEnabledEvent: PluginEnabledEvent) {
        if (pluginEnabledEvent.plugin.key == PLUGIN_KEY) {
            onPluginReadyState(PluginState.ON_PLUGIN_ENABLED_EVENT)
        }
    }

    override fun afterPropertiesSet() {
        eventPublisher.register(this)
        onPluginReadyState(PluginState.AFTER_PROPERTIES_SET)
    }

    override fun destroy() {
        eventPublisher.unregister(this)
    }


    override fun onStart() {
        onPluginReadyState(PluginState.LIFECYCLE_ON_START)
    }

    override fun onStop() {
        LOGGER.debug("PluginEventListener#onStop")
    }

    private fun onPluginReadyState(pluginState: PluginState) {
        if (this.isPluginReady(pluginState)) {
            // run Plugin work on start Jira System fully start
            pluginStartServices.forEach(PluginStartService::onStart)
        }
    }

    @Synchronized
    private fun isPluginReady(pluginState: PluginState): Boolean {
        lifecycleEvents.add(pluginState)
        return this.lifecycleEvents.size == PluginState.values().size
    }

    private enum class PluginState {
        AFTER_PROPERTIES_SET,
        ON_PLUGIN_ENABLED_EVENT,
        LIFECYCLE_ON_START;
    }
}
