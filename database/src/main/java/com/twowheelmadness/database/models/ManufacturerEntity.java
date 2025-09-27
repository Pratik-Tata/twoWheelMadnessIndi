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
public class ManufacturerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "manufacturer_seq")
    @SequenceGenerator(name = "manufacturer_seq", sequenceName = "manufacturer_sequence", allocationSize = 1)
    private Long id;
    @Column(nullable = false, unique = true)
    @EqualsAndHashCode.Include
    private String name;
    private String countryOfOrigin;
    private String yearOfEstablishment;
}
