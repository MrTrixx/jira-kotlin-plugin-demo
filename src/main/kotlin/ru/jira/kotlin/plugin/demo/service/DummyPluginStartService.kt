package ru.jira.kotlin.plugin.demo.service

import org.slf4j.Logger
import org.slf4j.LoggerFactory

open class DummyPluginStartService : PluginStartService {

    companion object {
        @JvmStatic
        private val LOGGER: Logger = LoggerFactory.getLogger(DummyPluginStartService::class.java)
    }

    override fun onStart() {
        LOGGER.debug("fired DummyPluginStartService#onStart from Kotlin")
    }
}