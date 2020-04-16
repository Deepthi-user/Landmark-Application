/*
 * @(#)GpsPoints.java 1.8 06/04/20
 * Copyright (c) 2020-2021
 */

package com.project.Smartparking_landmarks.model;

import com.project.Smartparking_landmarks.annotation.Latitude;
import com.project.Smartparking_landmarks.annotation.Longitude;
import javax.validation.constraints.NotNull;

/**
 * GpsPoints class uses for storing Gps points information.
 * @author Deepthi N
 * @version 1.0
 */

public class GpsPoints {

    @NotNull(message = "NorthEast latitude point cannot be empty")
    @Latitude(message = "Latitude is invalid")
    private Double northEastlat;

    @NotNull(message = "NorthEast longitude cannot be empty")
    @Longitude(message = "Longitude is invalid")
    private Double northEastlng;

    @NotNull(message = "southWest longitude cannot be empty")
    @Longitude(message = "Longitude is invalid")
    private Double southWestlng;

    @NotNull(message = "southWest latitude cannot be empty")
    @Latitude(message = "Latitude is invalid")
    private Double southWestlat;

    // This is a constructor to initialize GpsPoints object.
    public GpsPoints( Double northEastlat, Double northEastlng, Double southWestlng, Double southWestlat) {
        this.northEastlat = northEastlat;
        this.northEastlng = northEastlng;
        this.southWestlng = southWestlng;
        this.southWestlat = southWestlat;
    }

    public Double getNorthEastlat() {
        return northEastlat;
    }

    public void setNorthEastlat(Double northEastlat) {
        this.northEastlat = northEastlat;
    }

    public Double getNorthEastlng() {
        return northEastlng;
    }

    public void setNorthEastlng(Double northEastlng) {
        this.northEastlng = northEastlng;
    }

    public Double getSouthWestlng() {
        return southWestlng;
    }

    public void setSouthWestlng(Double southWestlng) {
        this.southWestlng = southWestlng;
    }

    public Double getSouthWestlat() {
        return southWestlat;
    }

    public void setSouthWestlat(Double southWestlat) {
        this.southWestlat = southWestlat;
    }
}
