package com.promerica;

import com.promerica.model.Persona;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/ping")
public class GreetingResourceNew {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Ping from Quarkus REST "+new java.util.Date();
    }

    @GET
    @Path("/ping/pong")
    @Produces(MediaType.APPLICATION_JSON)
    public Persona pong() {
        Persona persona = new Persona();
        persona.setName("Julian");
        persona.setLastName("Rivera Pineda");
        persona.setEmail("xtecuan@protonmail.com");
        return  persona;
    }
}
