package ru.jira.kotlin.plugin.demo.resource

import ru.jira.kotlin.plugin.demo.dto.healthcheck.HealthCheckDto
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/healthcheck")
@Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
open class HealthCheckPluginResource {

    @GET
    open fun healthCheck(): HealthCheckDto {
        return HealthCheckDto()
    }

}