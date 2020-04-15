/*
 * @(#)LandmarkService.java 1.8 06/04/20
 * Copyright (c) 2020-2021
 */

package com.project.Smartparking_landmarks.service;

import com.project.Smartparking_landmarks.dao.LandMarkRepository;
import com.project.Smartparking_landmarks.model.LandMark;
import com.project.Smartparking_landmarks.utilities.ErrorResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

/**
 * LandmarkService is used for Landmark.
 * @author Deepthi N
 * @version 1.0
 */

@Service
public class LandmarkService {

    @Autowired
    private LandMarkRepository landmarkRepository;

    /**
     * Method will either sends an error response or save the landmark object to repository.
     * @param landmarkObj - Object of LandMark class
     * @return - Object of either Landmark class or ErrorResponse class.
     */
    public Object createLandmarkRepository(LandMark landmarkObj) {
        String landmarkId = landmarkObj.getLandmarkId();
        Boolean ifLandmarkIdExists = this.checkIfLandmarkIdExists(landmarkId);
        if (ifLandmarkIdExists) {
            ErrorResponse errObj = new ErrorResponse("landmarkId already exists");
            return errObj;

        }
        else {
            return landmarkRepository.save(landmarkObj);
        }
    }

    /**
     * Method checks whether the landmarkId exists or not.
     * @param landmarkId String type
     * @return Boolean
     */
    public boolean checkIfLandmarkIdExists(String landmarkId) {
        Optional<LandMark> optionalObj = landmarkRepository.findById(landmarkId);
        if (optionalObj.isPresent()) {
            return true;
        }
        return false;
    }
}
