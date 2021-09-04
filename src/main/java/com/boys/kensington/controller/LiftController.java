package com.boys.kensington.controller;

import com.boys.kensington.model.Lift;
import com.boys.kensington.service.LiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/lift")
public class LiftController {


    @Autowired
    LiftService liftService;

    @GetMapping("/hello")
    public String helloMyLift() {
        return "Hello Big Lift!";
    }

    @GetMapping("/createLift/{type}")
    public String createLift(@PathVariable("type") String type) {
        return liftService.createLift(type);
    }

    @GetMapping("/getLift/{type}")
    public Lift getLift(@PathVariable("type") String type) {
        return liftService.fetchLift(type);
    }
}
