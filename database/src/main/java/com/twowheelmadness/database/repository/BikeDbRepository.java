package com.twowheelmadness.database.repository;

import com.twowheelmadness.database.models.BikeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BikeDbRepository extends JpaRepository<BikeEntity, String> {
    public List<BikeEntity> findAllByName(String name);
}
