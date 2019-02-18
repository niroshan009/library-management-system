package com.thusitha.library.config;

import com.thusitha.library.endpoints.MemberEndpoint;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig(){
        //Register your endpoints you want to expose
        register(MemberEndpoint.class);
    }

}
