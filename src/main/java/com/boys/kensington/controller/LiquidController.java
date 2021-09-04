package com.boys.kensington.controller;

import com.boys.kensington.model.AbstractLiquid;
import com.boys.kensington.model.Boy;
import com.boys.kensington.model.Liquid;
import com.boys.kensington.model.Piss;
import com.boys.kensington.service.BoyService;
import com.boys.kensington.service.LiquidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/liquid")
public class LiquidController {

    @Autowired
    LiquidService liquidService;

    @PostMapping("/createLiquid")
    public Liquid createLiquid(@RequestBody AbstractLiquid liquid) {
        System.out.println(liquid.getAroma());
        return liquidService.createLiquid(liquid);
    }

    @GetMapping("/getAllLiquids")
    public List<AbstractLiquid> getAllLiquids() {
        return liquidService.getAllLiquids();
    }
    @PostMapping("/addLiquid")
    public String addLiquid(@RequestBody AbstractLiquid liquid) {
        System.out.println(liquid.getAroma());
        return liquidService.addLiquid(liquid);
    }
}

