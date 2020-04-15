/*
 * @(#)SmartparkingLandmarksApplicationTests.java 1.8 06/04/20
 * Copyright (c) 2020-2021
 */

package com.project.Smartparking_landmarks;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * This is the main test file of SmartParkingLandmarks Application.
 * @author Deepthi N
 * @version 1.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SmartparkingLandmarksApplication.class)
class SmartparkingLandmarksApplicationTests {
    @Test
	void contextLoads() {
	}

	@Test
	public void contextTest() {
    	SmartparkingLandmarksApplication.main(new String[] {});
	}
}
