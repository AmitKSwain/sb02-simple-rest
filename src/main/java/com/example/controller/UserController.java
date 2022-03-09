package com.example.controller;

import com.example.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @GetMapping("/")
    public String healthCheck(){
        return "OK";
    }
    //pass parameters using query params  --http://localhost:8080/greet?name=Amit
    @GetMapping("/greet")
    public String greet(@RequestParam("name") String name){
        return "Hello "+name;
    }

    //pass parameters using path variable --http://localhost:8080/bye/Sumit
    @GetMapping("/bye/{name}")
    public String sayBye(@PathVariable("name") String name){
        return "Bye "+name;
    }

    //inpost using request body
    // use postman or any rest clint with url http://localhost:8080/register body { "name" :"Amit"}  method POST
    @PostMapping("/register")
    public String registerUser(@RequestBody User user){
        return "User :"+user.getName()+" is registered .";
    }
}
