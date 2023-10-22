package ru.jira.kotlin.plugin.demo.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.jira.kotlin.plugin.demo.service.DefaultPluginStarterService;
import ru.jira.kotlin.plugin.demo.service.DummyPluginStartService;
import ru.jira.kotlin.plugin.demo.service.PluginStartService;

@Configuration
public class ServiceConfiguration {

    @Bean
    PluginStartService pluginStarterService() {
        return new DefaultPluginStarterService();
    }

    // Usage Kotlin class in Java scope
    @Bean
    PluginStartService dummyPluginStartService() {
        return new DummyPluginStartService();
    }
}
