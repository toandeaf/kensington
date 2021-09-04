package com.boys.kensington.service;

import com.boys.kensington.model.AbstractContainer;
import com.boys.kensington.model.AbstractLiquid;
import com.boys.kensington.model.Liquid;
import com.boys.kensington.repository.LiquidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class LiquidService {

    @Autowired
    LiquidRepository liquidRepository;
    @Autowired
    ContainerService containerService;

    public Liquid createLiquid(AbstractLiquid liquid) {
            return liquidRepository.save(liquid);
    }
    public List<AbstractLiquid> getAllLiquids() {
        return liquidRepository.findAll();
    }

    public String addLiquid(AbstractLiquid liquid) {

        List <AbstractContainer> allContainers = containerService.getAllContainers();

        for (AbstractContainer container: allContainers){
            double currentVolume = container.getLiquids().stream().mapToDouble(AbstractLiquid::getVolume).sum();
            if (container.getCapacity() - currentVolume >= liquid.getVolume()){
                container.getLiquids().add(liquidRepository.save(liquid));
                containerService.save(container);
                return "Piss added";
            }
        }
        return "Not enough space to store your piss big guy ;)";
    }
}
