package ru.jira.kotlin.plugin.demo.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DefaultPluginStarterService implements PluginStartService {

    public void onStart() {
        log.debug("fired DefaultPluginStarterService#doSmthOnPluginReadyState from Java");
    }
}
