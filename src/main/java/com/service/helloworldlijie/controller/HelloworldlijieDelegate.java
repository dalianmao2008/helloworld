package com.service.helloworldlijie.controller;

import org.springframework.stereotype.Component;


@Component
public class HelloworldlijieDelegate {

    public String helloworld(String name){

        // Do Some Magic Here!
        return "welcome: " + name;
    }
}
