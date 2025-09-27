package com.twowheelmadness.database.mappers;

import com.twowheelmadness.database.models.SpecsEntity;
import com.twowheelmadness.domain.models.Bike;
import org.springframework.stereotype.Service;

@Service
public class SpecsMapper {

    public SpecsEntity mapDomainToEntity(Bike bike){
        return  SpecsEntity.builder()
                .isElectric(bike.getIsElectric())
                .centimeterCube(bike.getCentimeterCube())
                .horsePower(bike.getHorsePower())
                .torqueInNm(bike.getTorqueInNm())
                .noOfCylinders(bike.getNoOfCylinders())
                .valvesPerCylinders(bike.getValvesPerCylinders())
                .bore(bike.getBore())
                .stroke(bike.getStroke())
                .noOfGears(bike.getNoOfGears())
                .coolingType(bike.getCoolingType())
                .height(bike.getHeight())
                .weight(bike.getWeight())
                .length(bike.getLength())
                .width(bike.getWidth())
                .wheelBase(bike.getWheelBase())
                .frontWheelSize(bike.getFrontWheelSize())
                .rearWheelSize(bike.getRearWheelSize())
                .frontTyreSize(bike.getFrontTyreSize())
                .rearTyreSize(bike.getRearTyreSize())
                .fuelType(bike.getFuelType())
                .fuelConsumption(bike.getFuelConsumption())
                .range(bike.getRange())
                .hasCruiseControl(bike.getHasCruiseControl())
                .hasSlipperClutch(bike.getHasSlipperClutch())
                .hasQuickShifter(bike.getHasQuickShifter())
                .build();
    }

    public Bike mapEntityToDomain(SpecsEntity specsEntity) {
        return Bike.builder()
                .isElectric(specsEntity.getIsElectric())
                .centimeterCube(specsEntity.getCentimeterCube())
                .horsePower(specsEntity.getHorsePower())
                .torqueInNm(specsEntity.getTorqueInNm())
                .noOfCylinders(specsEntity.getNoOfCylinders())
                .valvesPerCylinders(specsEntity.getValvesPerCylinders())
                .bore(specsEntity.getBore())
                .stroke(specsEntity.getStroke())
                .noOfGears(specsEntity.getNoOfGears())
                .coolingType(specsEntity.getCoolingType())
                .height(specsEntity.getHeight())
                .weight(specsEntity.getWeight())
                .length(specsEntity.getLength())
                .width(specsEntity.getWidth())
                .wheelBase(specsEntity.getWheelBase())
                .frontWheelSize(specsEntity.getFrontWheelSize())
                .rearWheelSize(specsEntity.getRearWheelSize())
                .frontTyreSize(specsEntity.getFrontTyreSize())
                .rearTyreSize(specsEntity.getRearTyreSize())
                .fuelType(specsEntity.getFuelType())
                .fuelConsumption(specsEntity.getFuelConsumption())
                .range(specsEntity.getRange())
                .hasCruiseControl(specsEntity.getHasCruiseControl())
                .hasSlipperClutch(specsEntity.getHasSlipperClutch())
                .hasQuickShifter(specsEntity.getHasQuickShifter())
                .build();
    }
}
