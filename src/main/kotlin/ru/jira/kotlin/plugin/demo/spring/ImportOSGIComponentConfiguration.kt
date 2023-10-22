package ru.jira.kotlin.plugin.demo.spring

import com.atlassian.event.api.EventPublisher
import com.atlassian.plugins.osgi.javaconfig.OsgiServices
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class ImportOSGIComponentConfiguration {

    @Bean
    open fun eventPublisher(): EventPublisher {
        return OsgiServices.importOsgiService(EventPublisher::class.java)
    }

}
