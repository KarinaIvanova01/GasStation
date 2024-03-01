package com.example.gasstations.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "stations")

public class Stations {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;


    @Column(name = "name")
    private String name;


    @Column(name = "brand")
    private String brand;

    @Column(name = "street")
    private String street;


    @Column(name = "place")
    private String place;


    @Column(name = "lat")
    private double lat;


    @Column(name = "lng")
    private double lng;


    @Column(name = "dist")
    private double dist;

    @Column(name = "diesel")
    private double diesel;

    @Column(name = "e5")
    private double e5;

    @Column(name = "e10")
    private double e10;
    @Column(name = "isOpen")
    private boolean isOpen;

    @Column(name = "houseNumber")
    private String houseNumber;

    @Column(name = "postCode")
    private String postCode;

    public Stations() {
    }

    public Stations(UUID id, String name, String brand, String street, String place, double lat, double lng, double dist,
                    double diesel, double e5, double e10, boolean isOpen, String houseNumber, String postCode) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.street = street;
        this.place = place;
        this.lat = lat;
        this.lng = lng;
        this.dist = dist;
        this.diesel = diesel;
        this.e5 = e5;
        this.e10 = e10;
        this.isOpen = isOpen;
        this.houseNumber = houseNumber;
        this.postCode = postCode;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getStreet() {
        return street;
    }

    public String getPlace() {
        return place;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    public double getDist() {
        return dist;
    }

    public double getDiesel() {
        return diesel;
    }

    public double getE5() {
        return e5;
    }

    public double getE10() {
        return e10;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public void setDist(double dist) {
        this.dist = dist;
    }

    public void setDiesel(double diesel) {
        this.diesel = diesel;
    }

    public void setE5(double e5) {
        this.e5 = e5;
    }

    public void setE10(double e10) {
        this.e10 = e10;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}
