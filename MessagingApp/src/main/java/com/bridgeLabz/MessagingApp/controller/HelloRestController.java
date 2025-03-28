package com.bridgeLabz.MessagingApp.controller;

import com.bridgeLabz.MessagingApp.model.User;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/hello/post")
    public String sayHello(@RequestBody User user){
        return "Hello " + user.getFirstName() + " " + user.getLastName();
    }

    @PutMapping("/hello/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value="lastName") String lastName){
        return "Hello " +firstName + " " + lastName;
    }
}
