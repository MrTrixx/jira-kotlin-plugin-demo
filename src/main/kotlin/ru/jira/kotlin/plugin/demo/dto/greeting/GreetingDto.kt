package ru.jira.kotlin.plugin.demo.dto.greeting

import org.codehaus.jackson.annotate.JsonCreator
import org.codehaus.jackson.annotate.JsonProperty

data class GreetingDto @JsonCreator constructor(@JsonProperty(value = "a") val a: String, @JsonProperty(value = "sub") val sub: SubGreetingDto)
