package com.example.gasstations.services;

import com.example.gasstations.models.Station;

import java.util.List;

public interface GasStationService {
    List<Station> getAll();

    List<Station> getMedianPrice(String fuelType);

    List<Station> getMaxPrice(String fuelType);

    List<Station> getMinPrice(String fuelType);

    Station findByName(String name);
}
