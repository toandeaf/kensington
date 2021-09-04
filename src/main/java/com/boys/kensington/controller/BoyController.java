package com.boys.kensington.controller;

import com.boys.kensington.model.Boy;
import com.boys.kensington.service.BoyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boy")
public class BoyController {

    @Autowired
    BoyService boyService;

    @GetMapping("/hello")
    public String helloMyBoy() {
        return "Hello my boy!";
    }

    @GetMapping("/createBoy/{name}")
    public String createBoy(@PathVariable("name") String name) {
        return boyService.createBoy(name);
    }

    @GetMapping("/getBoy/{name}")
    public Boy getBoy(@PathVariable("name") String name) {
        return boyService.fetchBoy(name);
    }
}
