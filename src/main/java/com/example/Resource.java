package com.example;

import org.springframework.stereotype.Component;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Map;

@Component
@Path("/policy")
public class Resource {

    @GET
    @Path("/issue")
    @Produces(MediaType.TEXT_PLAIN)
    public String issuePolicy() throws Exception {
        return "Greetings from Spring Boot!";
    }
}
