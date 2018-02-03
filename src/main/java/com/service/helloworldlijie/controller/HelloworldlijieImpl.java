package com.service.helloworldlijie.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-02-03T01:41:56.003Z")

@RestSchema(schemaId = "helloworldlijie")
@RequestMapping(path = "/helloworld-lijie", produces = MediaType.APPLICATION_JSON)
public class HelloworldlijieImpl {

    @Autowired
    private HelloworldlijieDelegate userHelloworldlijieDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userHelloworldlijieDelegate.helloworld(name);
    }

}
