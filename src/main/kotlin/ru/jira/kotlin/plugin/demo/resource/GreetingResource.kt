package ru.jira.kotlin.plugin.demo.resource

import ru.jira.kotlin.plugin.demo.dto.greeting.GreetingDto
import ru.jira.kotlin.plugin.demo.dto.greeting.SubGreetingDto
import javax.ws.rs.Consumes
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/greeting")
open class GreetingResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    fun greeting(greetingDto: GreetingDto): SubGreetingDto {
        return greetingDto.subGreeting;
    }

}
