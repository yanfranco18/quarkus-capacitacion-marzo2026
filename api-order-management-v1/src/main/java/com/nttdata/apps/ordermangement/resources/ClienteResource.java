package com.nttdata.apps.ordermangement.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/api/v1/clientes")
public class ClienteResource {

    @GET
    public Response helloCliente() {
        return Response
                //.ok("Hello Cliente v2")
                .accepted("Hello Cliente")
                .build();
    }
}