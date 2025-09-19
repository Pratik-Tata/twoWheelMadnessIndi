package com.twowheelmadness.database.models;

import jakarta.persistence.*;
import lombok.*;

@SuppressWarnings("com.intellij.jpb.LombokEqualsAndHashCodeInspection")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@Entity
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "manufacturer_seq")
    @SequenceGenerator(name = "manufacturer_seq", sequenceName = "manufacturer_sequence", allocationSize = 1)
    @EqualsAndHashCode.Include
    private Long id;
    @EqualsAndHashCode.Include
    private String name;
    @EqualsAndHashCode.Include
    private String countryOfOrigin;
    private String yearOfEstablishment;
}
