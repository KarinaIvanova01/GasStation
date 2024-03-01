package com.example.gasstations.controllers;

import com.example.gasstations.models.Station;
import com.example.gasstations.services.GasStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stations")
public class GasStationController {

    private final GasStationService gasStationService;

    @Autowired
    public GasStationController(GasStationService gasStationService) {
        this.gasStationService = gasStationService;
    }

    @GetMapping
    public List<Station> getAll() {
        return gasStationService.getAll();
    }
    @GetMapping("/{name}")
    public List<Station> getByName(@PathVariable String name) {
        return gasStationService.findByName(name);
    }

    @GetMapping("/max/{fuelType}")
    public Double getMaxPrice(@PathVariable String fuelType) {
        return gasStationService.getMaxPrice(fuelType);
    }
    @GetMapping("/min/{fuelType}")
    public Double getMinPrice(@PathVariable String fuelType) {
        return gasStationService.getMinPrice(fuelType);
    }  @GetMapping("/median/{fuelType}")
    public Double getMedianPrice(@PathVariable String fuelType) {
        return gasStationService.getMedianPrice(fuelType);
    }

}
