/*
 * @(#)SmartparkingLandmarksApplication.java 1.8 06/04/20
 * Copyright (c) 2020-2021
 */

package com.project.Smartparking_landmarks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * This is the main file of SmartParkingLandmarks Application
 * @author Deepthi N
 * @version 1.0
 */

@SpringBootApplication
@EnableMongoRepositories({"com.project.Smartparking_landmarks.dao"})
public class SmartparkingLandmarksApplication {
	public static void main(String[] args) {
		SpringApplication.run(SmartparkingLandmarksApplication.class, args);
	}
}
