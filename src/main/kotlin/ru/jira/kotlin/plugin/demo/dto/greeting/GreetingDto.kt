package ru.jira.kotlin.plugin.demo.dto.greeting

import org.codehaus.jackson.annotate.JsonCreator
import org.codehaus.jackson.annotate.JsonProperty

data class GreetingDto @JsonCreator constructor(@JsonProperty(value = "strProp") val strProp: String,
                                                @JsonProperty(value = "subGreeting") val subGreeting: SubGreetingDto)
