package com.nttdata.apps.ordermangement.resources;

import com.nttdata.apps.ordermangement.entities.QueryLogEntity;
import com.nttdata.apps.ordermangement.service.QueryLogService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/api/v1/queries")
public class QueryLogResource {

    @Inject
    QueryLogService service;

    @GET
    public Response getAll() {
        var queries = service.getAll();

        if (queries.isEmpty()) {
            return Response.noContent().build();
        }

        return Response
                .ok(service.getAll())
                .build();
    }

    @POST
    public Response create(QueryLogEntity request) {
        return Response.ok(service.create(request)).build();
    }
}
