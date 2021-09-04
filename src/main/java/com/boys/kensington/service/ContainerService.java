package com.boys.kensington.service;

import com.boys.kensington.model.AbstractContainer;
import com.boys.kensington.model.Container;
import com.boys.kensington.repository.ContainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContainerService {

    @Autowired
    ContainerRepository containerRepository;

    public Container createContainer(AbstractContainer container) {
            return containerRepository.save(container);
    }
    public List<AbstractContainer> getAllContainers() {
        return containerRepository.findAll();
    }

    public AbstractContainer save(AbstractContainer container) {
        return containerRepository.save(container);
    }
}

