/*
 * @(#)LatitudeValidatorTest.java 1.8 06/04/20
 * Copyright (c) 2020-2021
 */

package com.project.Smartparking_landmarks.annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * LatitudeValidatorTest class used for testing LatitudeValidator class
 * @author Deepthi N
 * @version 1.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class LatitudeValidatorTest {

    @InjectMocks
    private LatitudeValidator latitudeTest;

    //To test with the invalid latitude

    @Test
    public void invalidLatitude() {
        boolean isInvalidLatitude = latitudeTest.isValid(-90.3422309, null);
        assertFalse(isInvalidLatitude,"Successfully checked with invalid latitude");
    }

    //To test with the valid latitude

    @Test
    public void validLatitude() {
        boolean isValidLatitude = latitudeTest.isValid(45.543981, null);
        assertTrue(isValidLatitude,"Successfully checked with valid latitude");
    }
}