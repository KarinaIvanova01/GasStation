package com.example.gasstations.services;

import com.example.gasstations.exceptions.EntityNotFoundException;
import com.example.gasstations.models.Station;
import com.example.gasstations.repositories.GasStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public List<Station> getMedianPrice(String fuelType) {
        return gasStationRepository.getMedianPrice(fuelType);
    }
@Override
    public List<Station> getMaxPrice(String fuelType) {
        return gasStationRepository.getMaxPrice(fuelType);
    }
@Override
    public List<Station> getMinPrice(String fuelType) {
        return gasStationRepository.getMinPrice(fuelType);
    }

@Override
    public Station findByName(String name) {
        Optional<Station> optionalStation = gasStationRepository.findByName(name);
        return optionalStation.orElseThrow(() -> new EntityNotFoundException("Station",name));
    }
}





