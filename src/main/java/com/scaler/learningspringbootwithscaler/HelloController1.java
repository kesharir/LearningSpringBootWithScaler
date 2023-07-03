package com.scaler.learningspringbootwithscaler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello1")
public class HelloController1 {
    @GetMapping("/world")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/you")
    public String helloYou(@RequestParam("name") String name) {
        return "Hello " + name;
    }
}
