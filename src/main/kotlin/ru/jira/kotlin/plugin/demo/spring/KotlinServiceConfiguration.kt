package ru.jira.kotlin.plugin.demo.spring

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import ru.jira.kotlin.plugin.demo.service.KotlinPluginStarterService
import ru.jira.kotlin.plugin.demo.service.PluginStartService

@Configuration
open class KotlinServiceConfiguration {

    @Bean
    open fun kotlinPluginStarterService(): PluginStartService {
        return KotlinPluginStarterService()
    }
}
