/*
 * @(#)LandMarkController.java 1.8 06/04/20
 * Copyright (c) 2020-2021
 */

package com.project.Smartparking_landmarks.controller;

import com.project.Smartparking_landmarks.dao.LandMarkRepository;
import com.project.Smartparking_landmarks.model.LandMark;
import com.project.Smartparking_landmarks.service.LandmarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.*;
import java.util.List;
import java.util.Optional;

/**
 * LandMarkController class which handles the requests POST, PUT, GET and DELETE.
 * @author Deepthi N
 * @version 1.0
 */

@CrossOrigin(origins ="*", allowedHeaders ="*")
@RestController
public class LandMarkController {

    @Autowired
    LandMarkRepository landmarkRepository;

    @Autowired
    LandmarkService landmarkService;

    // Adding landmarks

    @CrossOrigin(origins ="*", allowedHeaders ="*")
    @PostMapping("/landmark/saveLandmark")
    public Object addLandMark(@Valid @RequestBody LandMark landmark) {
        return landmarkService.createLandmarkRepository(landmark);
    }

    // Updating landmarks

    @CrossOrigin(origins ="*", allowedHeaders ="*")
    @PutMapping("/landmark/updateLandmark")
    public Object updateLandMark(@Valid @RequestBody LandMark landmark) {
        return landmarkRepository.save(landmark);
    }

    // Reading all landmarks

    @CrossOrigin(origins ="*", allowedHeaders ="*")
    @GetMapping("/landmark/all")
    public List<LandMark> getAllLandMark() {
        return landmarkRepository.findAll();
    }

    // Reading landmark by Id

    @CrossOrigin(origins ="*", allowedHeaders ="*")
    @GetMapping("/landmark/{landmarkId}")
    public Optional<LandMark> getLandMarkById(@PathVariable(value = "landmarkId") String landmarkId) {
        Optional<LandMark> landmark = landmarkRepository.findById(landmarkId);
        return landmark;
    }

    // Deleting landmark by Id

    @CrossOrigin(origins ="*", allowedHeaders ="*")
    @DeleteMapping(value = "/landmark/{landmarkId}")
    public void deleteLandMark (@PathVariable(name = "landmarkId") String landmarkId) {
        landmarkRepository.deleteById(landmarkId);
    }
}


