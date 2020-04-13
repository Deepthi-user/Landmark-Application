/*
 * @(#)LandMark.java 1.8 06/04/20
 * Copyright (c) 2020-2021
 */

package com.project.Smartparking_landmarks.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * LandMark class uses for storing landmark information.
 * @author Deepthi N
 * @version 1.0
 */

@Document(collection = "landmarks")
public class LandMark {

    @Id
    @NotEmpty(message = "LandmarkId cannot be empty")
    @Size(min=5,max=14, message = "LandmarkId must be equal to or greater than 5 characters and less than 14 characters")
    private String landmarkId;

    @NotEmpty(message = "image cannot be empty")
    @Pattern(message= "Invalid image format", regexp = "([^\\s]+(\\.(?i)(jpg|png|gif|bmp))$)" )
    @Size(min=6,max=25, message = "image must be equal to or greater than 4 characters and less than 25 characters")
    private String image;

    @Valid
    private  GpsPoints gpsPoints;

    @NotEmpty(message = "Scale cannot be empty")
    @Size(min=7,max=10, message = "Scale must be equal to or greater than 8 characters and less than 10 characters")
    private String scale;

    @NotEmpty(message = "Anchor cannot be empty")
    @Size(min = 1, max=2, message = "Anchor must be equal to or greater than 1 character and less than 2 characters")
    private String anchor;

    // This is a constructor to initialize LandMark object.
    public LandMark(String landmarkId, String image, GpsPoints gpsPoints, String scale, String anchor) {
        this.landmarkId = landmarkId;
        this.image = image;
        this.gpsPoints = gpsPoints;
        this.scale = scale;
        this.anchor = anchor;
    }

    public String getLandmarkId() {
        return landmarkId;
    }

    public void setLandmarkId(String landmarkId) {
        this.landmarkId = landmarkId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public GpsPoints getGpsPoints() {
        return gpsPoints;
    }

    public void setGpsPoints(GpsPoints gpsPoints) {
        this.gpsPoints = gpsPoints;
    }

    public String getAnchor() {
        return anchor;
    }

    public void setAnchor(String anchor) {
        this.anchor = anchor;
    }
}

