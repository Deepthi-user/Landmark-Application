/*
 * @(#)LongitudeValidatorTest.java 1.8 06/04/20
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
 * LongitudeValidatorTest class used for testing LongitudeValidator class.
 * @author Deepthi N
 * @version 1.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class LongitudeValidatorTest {

    @InjectMocks
    private LongitudeValidator longitudeTest;

    //To test with the invalid longitude

    @Test
    public void invalidLongitude() {
        boolean isInValidLongitude = longitudeTest.isValid(-98.0923913, null);
        assertFalse(isInValidLongitude,"Successfully checked with invalid longitude");
    }

    //To test with the valid longitude

    @Test
    public void validLongitude() {
        boolean isValidLongitude = longitudeTest.isValid(-122.961818, null);
        assertTrue(isValidLongitude,"Successfully checked with valid longitude");
    }
}