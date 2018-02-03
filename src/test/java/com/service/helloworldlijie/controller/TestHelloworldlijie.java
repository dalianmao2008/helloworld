package com.service.helloworldlijie.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestHelloworldlijie {

        HelloworldlijieDelegate helloworldlijieDelegate = new HelloworldlijieDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "welcome: hello"; // You should put the expect String type value here.

        String returnValue = helloworldlijieDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
