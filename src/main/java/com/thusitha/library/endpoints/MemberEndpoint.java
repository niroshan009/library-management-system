package com.thusitha.library.endpoints;

import com.thusitha.library.model.Member;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Component
@Path(value = "/member")
public class MemberEndpoint {

    @POST
    @Path(value = "/addMember")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Member addUser(Member member){
        System.out.println("First Name: "+member.getFirstName());
        System.out.println("Last Name: "+member.getLastName());
        System.out.println("NIC: "+member.getNic());
        System.out.println("Telephone: "+member.getTelephoneNumber());
        return member;
    }
}
