package com.thusitha.library.endpoints;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Component
@Path(value = "/member")
public class MemberEndpoint {

    @GET
    public String getGreeting(){
        return "Hello World";
    }
}
