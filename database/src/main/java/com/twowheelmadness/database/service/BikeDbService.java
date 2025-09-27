package com.twowheelmadness.database.service;

import com.twowheelmadness.database.mappers.BikeMapper;
import com.twowheelmadness.database.repository.BikeDbRepository;
import com.twowheelmadness.domain.models.Bike;
import com.twowheelmadness.domain.models.Manufacturer;
import com.twowheelmadness.domain.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BikeDbService implements BikeRepository {

    @Autowired
    BikeDbRepository bikeDbRepository;
    @Autowired
    BikeMapper bikeMapper;

    @Autowired
    public BikeDbService(BikeDbRepository bikeDbRepository, BikeMapper bikeMapper) {
        this.bikeDbRepository = bikeDbRepository;
        this.bikeMapper = bikeMapper;
    }

    @Override
    public boolean save(Bike bike, Manufacturer manufacturer) {
        var bikeEntity = bikeMapper.mapDomainToEntity(bike,manufacturer);
        bikeDbRepository.save(bikeEntity);
        return true;
    }

    @Override
    public List<Bike> findAllByName(String name) {
        var bikeEntityList =  bikeDbRepository.findAllByName(name);
        List<Bike> bikeList = new ArrayList<>();
        bikeEntityList.forEach(bike -> bikeList.add(bikeMapper.mapEntityToDomain(bike)));
        return bikeList;
    }
}
