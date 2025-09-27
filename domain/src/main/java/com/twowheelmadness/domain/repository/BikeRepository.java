package com.twowheelmadness.domain.repository;

import com.twowheelmadness.domain.models.Bike;
import com.twowheelmadness.domain.models.Manufacturer;

import java.util.List;

public interface BikeRepository {
    public boolean save(Bike bike, Manufacturer manufacturer);
    public List<Bike> findAllByName(String name);
}
