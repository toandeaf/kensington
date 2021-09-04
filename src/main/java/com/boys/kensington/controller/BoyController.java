package com.boys.kensington.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/boy")
public class BoyController {


    @GetMapping("/hello")
    public String helloMyBoy() {
        return "Hello my boy!";
    }
}
