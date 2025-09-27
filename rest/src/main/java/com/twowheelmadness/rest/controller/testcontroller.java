package com.twowheelmadness.rest.controller;

import com.twowheelmadness.application.service.BIkeApplicationService;
import com.twowheelmadness.database.models.BikeEntity;
import com.twowheelmadness.database.models.ManufacturerEntity;
import com.twowheelmadness.database.models.SpecsEntity;
import com.twowheelmadness.database.repository.BikeDbRepository;
import com.twowheelmadness.domain.models.Bike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/test")
public class testcontroller {

    @Autowired
    BIkeApplicationService bIkeApplicationService;

    @GetMapping("/hello")
    public List<Bike> helloWorld(){
        return bIkeApplicationService.getAllBikeByName("R1");
    }
}
