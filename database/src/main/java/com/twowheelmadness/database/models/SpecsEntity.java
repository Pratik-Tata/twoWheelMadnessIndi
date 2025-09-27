package com.twowheelmadness.database.models;

import com.twowheelmadness.domain.commons.Cooling;
import com.twowheelmadness.domain.commons.Fuel;
import jakarta.persistence.*;
import lombok.*;

@SuppressWarnings("com.intellij.jpb.LombokEqualsAndHashCodeInspection")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class SpecsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    @EqualsAndHashCode.Include
    private Long id;

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
    @Enumerated(EnumType.STRING)
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
    @Enumerated(EnumType.STRING)
    private Fuel fuelType;
    private Double fuelConsumption; //in km/l
    private Double range; //in km

    //features and others
    private Boolean hasCruiseControl;
    private Boolean hasSlipperClutch;
    private Boolean hasQuickShifter;
}
