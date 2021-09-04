package com.boys.kensington.service;

import com.boys.kensington.model.Lift;
import com.boys.kensington.repository.LiftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LiftService {

    @Autowired
    LiftRepository liftRepository;

    public String createLift(String type) {
        Lift lift = new Lift();
        lift.setType(type);
        lift.setMax(200);
        try {
            liftRepository.save(lift);
        } catch (Exception e) {
            return "Deng, didn't work";
        }
        return "Good Lift";

    }

    public Lift fetchLift(String type) {
        try {
            List<Lift> lifts = liftRepository.findAll();
            Optional<Lift> potentialLift = lifts.stream()
                    .filter(lift -> lift.getType().equalsIgnoreCase(type))
                    .findFirst();
            return potentialLift.orElse(new Lift());

        } catch (Exception e) {
            return new Lift();
        }
    }
}
