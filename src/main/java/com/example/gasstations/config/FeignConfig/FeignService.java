package com.example.gasstations.config.FeignConfig;

import com.example.gasstations.models.Dto;
import com.example.gasstations.models.Station;
import com.example.gasstations.repositories.GasStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeignService {


    private final GasStationClient gasStationClient;

    private final GasStationRepository gasStationRepository;


@Autowired
    public FeignService(GasStationClient gasStationClient, GasStationRepository gasStationRepository) {
        this.gasStationClient = gasStationClient;
        this.gasStationRepository = gasStationRepository;

    }
    @EventListener(ApplicationReadyEvent.class)
    public void retrieveAndStoreGasStations() {
        Dto response = gasStationClient.getGasStationData();
        List<Station> stations = response.getStations();
        gasStationRepository.saveAll(stations);
    }

}
