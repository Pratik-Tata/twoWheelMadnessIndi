package com.twowheelmadness.application.service;

import com.twowheelmadness.domain.models.Bike;
import com.twowheelmadness.domain.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BIkeApplicationService {

    @Autowired
    BikeRepository bikeRepository;

    public List<Bike> getAllBikeByName(String name){
        return  bikeRepository.findAllByName(name);
    }

}
