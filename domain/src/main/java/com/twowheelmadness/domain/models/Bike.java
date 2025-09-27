package com.twowheelmadness.domain.models;

import com.twowheelmadness.domain.commons.Cooling;
import com.twowheelmadness.domain.commons.Fuel;
import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@Builder
public class Bike {

    private String name;
    private Integer iteration;
    private LocalDate launchDate;
    private LocalDate discontinuedDate;
    private Boolean hasFaceliftOrNextIteration;
    private Double price;
    private String notes;

    private String manufacturerName;

    //engine specs
    private Boolean isElectric;
    private Double centimeterCube;
    private Double horsePower;
    private Double torqueInNm;
    private Integer noOfCylinders;
    private Integer valvesPerCylinders;
    private Double bore;
    private Double stroke;
    private Integer noOfGears; // 0 for cvt
    private Cooling coolingType;

    //dimensions & weight in meters
    private Double height;
    private Double weight;
    private Double length;
    private Double width;
    private Double wheelBase;
    private Double frontWheelSize;
    private Double rearWheelSize;
    private String frontTyreSize;
    private String rearTyreSize;

    //Tank capacity, range and fuel
    private Fuel fuelType;
    private Double fuelConsumption; //in km/l
    private Double range; //in km

    //features and others
    private Boolean hasCruiseControl;
    private Boolean hasSlipperClutch;
    private Boolean hasQuickShifter;

}
