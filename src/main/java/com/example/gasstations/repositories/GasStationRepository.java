package com.example.gasstations.repositories;

import com.example.gasstations.models.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface GasStationRepository extends JpaRepository<Station, UUID> {

    @Query(value = "SELECT ROUND(AVG(CASE " +
            "       WHEN :fuelType = 'diesel' THEN s.diesel " +
            "       WHEN :fuelType = 'e5' THEN s.e5 " +
            "       WHEN :fuelType = 'e10' THEN s.e10 " +
            "       END), 3) " +
            "FROM Station s")
    Double getMedianPrice(String fuelType);

    @Query(value = "SELECT ROUND(MAX(CASE " +
            "       WHEN :fuelType = 'diesel' THEN s.diesel " +
            "       WHEN :fuelType = 'e5' THEN s.e5 " +
            "       WHEN :fuelType = 'e10' THEN s.e10 " +
            "       END), 3) " +
            "FROM Station s")
    Double getMaxPrice(String fuelType);


    @Query(value = "SELECT ROUND(MIN(CASE " +
            "       WHEN :fuelType = 'diesel' THEN s.diesel " +
            "       WHEN :fuelType = 'e5' THEN s.e5 " +
            "       WHEN :fuelType = 'e10' THEN s.e10 " +
            "       END), 3) " +
            "FROM Station s")
    Double getMinPrice(String fuelType);

    List<Station> findByName(String name);
}