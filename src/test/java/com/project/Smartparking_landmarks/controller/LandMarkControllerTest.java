/*
 * @(#)LandMarkControllerTest.java 1.8 06/04/20
 * Copyright CTO-LTTS 2020-2021
 */

package com.project.Smartparking_landmarks.controller;

import com.project.Smartparking_landmarks.utilities.AbstractTest;
import com.project.Smartparking_landmarks.model.GpsPoints;
import com.project.Smartparking_landmarks.model.LandMark;
import org.junit.jupiter.api.*;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * LandMarkControllerTest class is used for testing the requests POST, PUT, GET and DELETE.
 * It uses mapToJson function of AbstractTest class.
 * @author Deepthi N
 * @version 1.0
 */

class LandMarkControllerTest extends AbstractTest {

    GpsPoints gpsObj = new GpsPoints(45.543981, -122.961818, 45.543879, -122.961974);
    LandMark landmarkObj = new LandMark("ImbcgT78", "islandbot.png", gpsObj, "stretch", "sw");

    //Run before each methods in this class

    @BeforeEach
    public void setUp() {
        super.setUp();
    }

    //Testing the POST request

    @Test
    void addLandMark() throws Exception {

        //Converts the Landmark object to json format
        String inputJson = super.mapToJson(landmarkObj);

        //Testing POST request using MockMvc testing framework
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post("/landmark/saveLandmark")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(inputJson)).andReturn();
        int status = mvcResult.getResponse().getStatus();

        //Compares the resultant response with the expected response
        assertEquals(200, status, "Invalid status");
    }

    //Testing the GET request

    @Test
    void getAllLandMark() throws Exception {

        //Testing GET request using MockMvc testing framework
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get("/landmark/all")
                .accept(MediaType.APPLICATION_JSON_VALUE))
                .andReturn();
        int status = mvcResult.getResponse().getStatus();

        //Compares the resultant response with the expected response
        assertEquals(200, status,"Invalid status");
    }

    //Testing the GET request

    @Test
    void getLandMarkById() throws Exception {

        //Testing GET request using MockMvc testing framework
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get("/landmark/ImbcgT78")
                .accept(MediaType.APPLICATION_JSON_VALUE))
                .andReturn();
        int status = mvcResult.getResponse().getStatus();

        //Compares the resultant response with the expected response
        assertEquals(200, status,"Invalid status");
    }

    //Testing the PUT request

    @Test
    void updateLandMark() throws Exception {

        //Updating Image name of LandMark
        landmarkObj.setImage("island.png");

        //Converts the Landmark object to json format
        String inputJson = super.mapToJson(landmarkObj);

        //Testing PUT request using MockMvc testing framework
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.put("/landmark/updateLandmark")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(inputJson)).andReturn();
        int status = mvcResult.getResponse().getStatus();

        //Compares the resultant response with the expected response
        assertEquals(200, status,"Invalid status");
    }

    //Testing the DELETE request

    @Test
    void deleteLandMark() throws Exception {

        //Testing DELETE request using MockMvc testing framework
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete("/landmark/ImbcgT78")
                .accept(MediaType.APPLICATION_JSON_VALUE))
                .andReturn();
        int status = mvcResult.getResponse().getStatus();

        //Compares the resultant response with the expected response
        assertEquals(200, status,"Invalid status");
    }
}