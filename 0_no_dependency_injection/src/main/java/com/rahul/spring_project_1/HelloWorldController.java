package com.rahul.spring_project_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class HelloWorldController {

//@GetMapping(path = "/hello")
    public String helloWorld(){
        return "Hello there";
    }
}
