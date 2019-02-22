package com.thusitha.library.endpoints;

import com.thusitha.library.model.Member;
import com.thusitha.library.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Component
@Path(value = "/member")
public class MemberEndpoint {

    @Autowired
    MemberRepository memberRepository;

    @POST
    @Path(value = "/addMember")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Member addUser(Member member){
        return memberRepository.save(member);
    }
}
