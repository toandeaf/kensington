package com.boys.kensington.controller;

import com.boys.kensington.model.Boy;
import com.boys.kensington.service.BoyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/boy")
public class BoyController {

    @Autowired
    BoyService boyService;

    @GetMapping("/createBoy/{name}")
    public String createBoy(@PathVariable("name") String name) {
        return boyService.createBoy(name);
    }

    @GetMapping("/getBoy/{name}")
    public Boy getBoy(@PathVariable("name") String name) {
        return boyService.fetchBoy(name);
    }

    @PostMapping("/createBoy")
    public Boy createBoy(@RequestBody Boy boy) {
        return boyService.createBoyFromScratch(boy);
    }
}
