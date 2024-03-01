package com.example.gasstations.repositories;

import com.example.gasstations.models.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface GasStationRepository extends JpaRepository<Station, UUID> {

    @Query("SELECT s FROM Station s " +
            "GROUP BY s.id " +
            "ORDER BY AVG(CASE WHEN :fuelType = 'diesel' THEN s.diesel " +
            "                  WHEN :fuelType = 'e5' THEN s.e5 " +
            "                  WHEN :fuelType = 'e10' THEN s.e10 " +
            "             END)")
    List<Station> getMedianPrice(String fuelType);

    @Query("SELECT s FROM Station s " +
            "GROUP BY s.id " +
            "ORDER BY MAX(CASE WHEN :fuelType = 'diesel' THEN s.diesel " +
            "                  WHEN :fuelType = 'e5' THEN s.e5 " +
            "                  WHEN :fuelType = 'e10' THEN s.e10 " +
            "             END)")
    List<Station> getMaxPrice(String fuelType);


    @Query("SELECT s FROM Station s " +
            "GROUP BY s.id " +
            "ORDER BY MIN(CASE WHEN :fuelType = 'diesel' THEN s.diesel " +
            "                  WHEN :fuelType = 'e5' THEN s.e5 " +
            "                  WHEN :fuelType = 'e10' THEN s.e10 " +
            "             END)")
    List<Station> getMinPrice(String fuelType);

    Optional<Station> findByName(String name);
}