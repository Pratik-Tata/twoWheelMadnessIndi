package com.twowheelmadness.database.repository;

import com.twowheelmadness.database.models.ManufacturerEntity;
import com.twowheelmadness.domain.models.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufacturerDbRepository extends JpaRepository<ManufacturerEntity,String> {
}
