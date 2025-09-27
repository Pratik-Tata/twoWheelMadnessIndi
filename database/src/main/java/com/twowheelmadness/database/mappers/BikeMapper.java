package com.twowheelmadness.database.mappers;

import com.twowheelmadness.database.models.BikeEntity;
import com.twowheelmadness.domain.models.Bike;
import com.twowheelmadness.domain.models.Manufacturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BikeMapper {

    ManufacturerMapper manufacturerMapper;
    SpecsMapper specsMapper;

    @Autowired
    public BikeMapper(ManufacturerMapper manufacturerMapper, SpecsMapper specsMapper) {
        this.manufacturerMapper = manufacturerMapper;
        this.specsMapper = specsMapper;
    }

    public BikeEntity mapDomainToEntity(Bike bike, Manufacturer manufacturer){
        var manufacturerEntity = manufacturerMapper.mapDomainToEntity(manufacturer);
        var specsEntity = specsMapper.mapDomainToEntity(bike);

        return  BikeEntity.builder()
                .name(bike.getName())
                .iteration(bike.getIteration())
                .launchDate(bike.getLaunchDate())
                .discontinuedDate(bike.getDiscontinuedDate())
                .hasFaceliftOrNextIteration(bike.getHasFaceliftOrNextIteration())
                .price(bike.getPrice())
                .notes(bike.getNotes())
                .manufacturerEntity(manufacturerEntity)
                .specsEntity(specsEntity)
                .build();
    }

    public Bike mapEntityToDomain(BikeEntity bikeEntity){
        var bike = specsMapper.mapEntityToDomain(bikeEntity.getSpecsEntity());

        bike.setManufacturerName(manufacturerMapper.mapEntityToDomain(bikeEntity.getManufacturerEntity()).getName());
        bike.setName(bikeEntity.getName());
        bike.setIteration(bikeEntity.getIteration());
        bike.setLaunchDate(bikeEntity.getLaunchDate());
        bike.setDiscontinuedDate(bikeEntity.getDiscontinuedDate());
        bike.setHasFaceliftOrNextIteration(bike.getHasFaceliftOrNextIteration());
        bike.setPrice(bikeEntity.getPrice());
        bike.setNotes(bike.getNotes());

        return bike;
    }
}
