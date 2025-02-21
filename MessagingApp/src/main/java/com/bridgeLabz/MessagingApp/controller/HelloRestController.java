package com.bridgeLabz.MessagingApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @GetMapping("/hello")
    public String printHello(){
        return "Hello from BridgeLabz";
    }

    @GetMapping("/hello/query")
    public String printHelloQuery(@RequestParam(value = "name") String name){
       return "Hello " + name;
    }

    @GetMapping("/hello/param/{name}")
    public String printHelloParam(@PathVariable String name){
        return "Hello " + name;
    }
}
