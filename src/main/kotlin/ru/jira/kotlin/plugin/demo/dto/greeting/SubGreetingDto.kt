package ru.jira.kotlin.plugin.demo.dto.greeting

import org.codehaus.jackson.annotate.JsonAutoDetect
import org.codehaus.jackson.annotate.JsonCreator
import org.codehaus.jackson.annotate.JsonProperty

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class SubGreetingDto @JsonCreator constructor(@JsonProperty(value = "intPropFirst") val intPropFirst: Int,
                                                   @JsonProperty(value = "intPropSecond") val intPropSecond: Int)
