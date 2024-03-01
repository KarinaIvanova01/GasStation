package com.example.gasstations.services;

import com.example.gasstations.models.Station;
import com.example.gasstations.repositories.GasStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GasStationServiceImpl implements GasStationService {

    private final GasStationRepository gasStationRepository;

    @Autowired
    public GasStationServiceImpl(GasStationRepository gasStationRepository) {
        this.gasStationRepository = gasStationRepository;
    }
@Override
    public List<Station> getAll() {
        return gasStationRepository.findAll();

    }
@Override
    public Double getMedianPrice(String fuelType) {
        return gasStationRepository.getMedianPrice(fuelType);
    }
@Override
    public Double getMaxPrice(String fuelType) {
        return gasStationRepository.getMaxPrice(fuelType);
    }
@Override
    public Double getMinPrice(String fuelType) {
        return gasStationRepository.getMinPrice(fuelType);
    }


    @Override
    public List<Station> findByName(String name) {
        return gasStationRepository.findByName(name);
    }
}








