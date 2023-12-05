package ru.jira.kotlin.plugin.demo.spring

import com.atlassian.event.api.EventPublisher
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import ru.jira.kotlin.plugin.demo.event.PluginEventListener
import ru.jira.kotlin.plugin.demo.service.PluginStartService

@Configuration
open class EventListenerConfiguration {

    @Bean
    open fun pluginEventListener(eventPublisher: EventPublisher,
                                 pluginStartServices: List<PluginStartService>): PluginEventListener {
        return PluginEventListener(eventPublisher, pluginStartServices)
    }
}


