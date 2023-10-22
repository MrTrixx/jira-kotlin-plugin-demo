package ru.jira.kotlin.plugin.demo.dto.healthcheck

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlRootElement

@XmlRootElement
@XmlAccessorType(value = XmlAccessType.FIELD)
data class HealthCheckDto(@XmlElement(required = true) var healthCheckState: String? = "OK") {}
