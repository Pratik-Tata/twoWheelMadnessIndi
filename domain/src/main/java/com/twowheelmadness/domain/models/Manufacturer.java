package com.twowheelmadness.domain.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Manufacturer {
    private String name;
    private String countryOfOrigin;
    private String yearOfEstablishment;
}
