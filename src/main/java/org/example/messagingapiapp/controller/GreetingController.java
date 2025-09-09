package org.example.messagingapiapp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {


    @GetMapping("/oracle")
    public String greet() {
        return "Hi Oracle !! with the rest url";
    }

    @GetMapping
    public String greet2() {
        return "Hi Guest !! with the rest url";
    }
}
