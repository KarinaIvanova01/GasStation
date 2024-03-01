package com.example.gasstations.services;

import com.example.gasstations.models.Station;

import java.util.List;

public interface GasStationService {
    List<Station> getAll();

    Double getMedianPrice(String fuelType);

    Double getMaxPrice(String fuelType);

    Double getMinPrice(String fuelType);

    List<Station> findByName(String name);
}
