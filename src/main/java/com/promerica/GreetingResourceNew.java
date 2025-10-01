package com.promerica;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/ping")
public class GreetingResourceNew {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Ping from Quarkus REST "+new java.util.Date();
    }
}
