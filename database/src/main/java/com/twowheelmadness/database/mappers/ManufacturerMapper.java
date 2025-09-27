package com.twowheelmadness.database.mappers;

import com.twowheelmadness.database.models.BikeEntity;
import com.twowheelmadness.database.models.ManufacturerEntity;
import com.twowheelmadness.domain.models.Manufacturer;
import org.springframework.stereotype.Service;

@Service
public class ManufacturerMapper {

    public ManufacturerEntity mapDomainToEntity(Manufacturer manufacturer){
        return   ManufacturerEntity.builder()
                .name(manufacturer.getName())
                .yearOfEstablishment(manufacturer.getYearOfEstablishment())
                .countryOfOrigin(manufacturer.getCountryOfOrigin())
                .build();
    }

    public Manufacturer mapEntityToDomain(ManufacturerEntity manufacturerEntity){
        return Manufacturer.builder()
                .name(manufacturerEntity.getName())
                .build();
    }

}
