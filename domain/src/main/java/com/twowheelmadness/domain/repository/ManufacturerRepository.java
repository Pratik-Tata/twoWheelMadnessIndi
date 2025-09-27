package com.twowheelmadness.domain.repository;

public interface ManufacturerRepository {
    public boolean exists(String name);
    public boolean save();
}
