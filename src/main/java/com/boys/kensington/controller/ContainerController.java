package com.boys.kensington.controller;

import com.boys.kensington.model.AbstractContainer;
import com.boys.kensington.model.AbstractLiquid;
import com.boys.kensington.model.Container;
import com.boys.kensington.model.Liquid;
import com.boys.kensington.service.ContainerService;
import com.boys.kensington.service.LiquidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/container")
public class ContainerController {

    @Autowired
    ContainerService containerService;

    @PostMapping("/createContainer")
    public Container createContainer(@RequestBody AbstractContainer container) {
        System.out.println(container.getCapacity());
        return containerService.createContainer(container);
    }
    @GetMapping("/getAllContainers")
    public List<AbstractContainer> allContainers(){
        return containerService.getAllContainers();
    }

}

