package ru.jira.kotlin.plugin.demo.service;

import org.slf4j.Logger
import org.slf4j.LoggerFactory

open class KotlinPluginStarterService : PluginStartService {

    companion object {
        @JvmStatic
        private val LOGGER: Logger = LoggerFactory.getLogger(KotlinPluginStarterService::class.java)
    }

    override fun onStart() {
        LOGGER.debug("fired KotlinPluginStarterService#onStart from Kotlin")
    }

}
