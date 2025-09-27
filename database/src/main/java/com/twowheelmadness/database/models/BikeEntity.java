package com.twowheelmadness.database.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@SuppressWarnings("com.intellij.jpb.LombokEqualsAndHashCodeInspection")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity

@Table(
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"name", "iteration"})
        }
)
public class BikeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bike_seq")
    @SequenceGenerator(name = "bike_seq", sequenceName = "bike_sequence", allocationSize = 1)
    private Long id;
    @EqualsAndHashCode.Include
    private String name;
    @EqualsAndHashCode.Include
    private Integer iteration;
    private LocalDate launchDate;
    private LocalDate discontinuedDate;
    private Boolean hasFaceliftOrNextIteration;
    private Double price;
    private String notes;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "manufacturer_id")
    private ManufacturerEntity manufacturerEntity;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "specs_id", unique = true)
    private SpecsEntity specsEntity;
}
