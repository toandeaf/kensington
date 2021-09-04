package com.boys.kensington.service;

import com.boys.kensington.model.Boy;
import com.boys.kensington.repository.BoyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoyService {

    @Autowired
    BoyRepository boyRepository;

    public String createBoy(String name) {
        Boy boy = new Boy();
        boy.setName(name);
        boy.setAge(29);
        boy.setJob("Software Man");
        try {
            boyRepository.save(boy);
        } catch (Exception e ) {
            return "BOO HOO IT DIDNT WORK";
        }
        return "THAT BOY PERSISTED";
    }

    public Boy fetchBoy(String name) {
        try {
            List<Boy> boys = boyRepository.findAll();
            Optional<Boy> potentialBoy = boys.stream()
                    .filter(boy -> boy.getName().equalsIgnoreCase(name))
                    .findFirst();
            return potentialBoy.orElse(new Boy());
        } catch (Exception e ) {
            return new Boy();
        }
    }
}
