package ru.jira.kotlin.plugin.demo.dto.healthcheck

import javax.xml.bind.annotation.XmlEnum
import javax.xml.bind.annotation.XmlEnumValue
import javax.xml.bind.annotation.XmlType

@XmlEnum
@XmlType(name = "healthCheckState")
enum class HealthCheckState {

    @XmlEnumValue(value = "OK") OK,
    @XmlEnumValue(value = "FAIL") FAIL;
}