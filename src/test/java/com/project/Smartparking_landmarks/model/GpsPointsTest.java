/*
 * @(#)GpsPointsTest.java 1.8 06/04/20
 * Copyright (c) 2020-2021
 */

package com.project.Smartparking_landmarks.model;

import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import javax.validation.*;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

/**
 * GpsPointsTest class is used for testing the Gps points model.
 * @author Deepthi N
 * @version 1.0
 */

class GpsPointsTest {

    @InjectMocks
    private GpsPoints gpsObj;

    // To create an instance of Validator
    ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
    Validator validator = validatorFactory.getValidator();

    //Run before all tests in the class.

    @BeforeAll
    static void setUp() {
    }

    //Run before each methods in this class

    @BeforeEach
    void init() {
        this.gpsObj = new GpsPoints(45.543981, -122.961818, 45.543879, -122.961974);

        //To set context as null

        ConstraintValidatorContext context = null;
    }

    // To test the setter of North-East latitude

    @Test
    void setNorthEastlat() {
        Double northEastlat = 45.543981;
        gpsObj.setNorthEastlat(northEastlat);
        assertSame(gpsObj.getNorthEastlat(), northEastlat);
        assertEquals(gpsObj.getNorthEastlat(), northEastlat);
    }

    // To test the setter of North-East longitude

    @Test
    void setNorthEastlng() {
        Double northEastlng = -122.961818;
        gpsObj.setNorthEastlng(northEastlng);
        assertSame(gpsObj.getNorthEastlng(), northEastlng);
        assertEquals(gpsObj.getNorthEastlng(), northEastlng);
    }

    // To test the setter of South-West Longitude

    @Test
    void setSouthWestlng() {
        Double southWestlng = 45.543879;
        gpsObj.setSouthWestlng(southWestlng);
        assertSame(gpsObj.getSouthWestlng(), southWestlng);
        assertEquals(gpsObj.getSouthWestlng(), southWestlng);
    }

    // To test the setter of South-West latitude

    @Test
    void setSouthWestlat() {
        Double southWestlat = -122.9619456;
        gpsObj.setSouthWestlat(southWestlat);
        assertSame(gpsObj.getSouthWestlat(), southWestlat);
        assertEquals(gpsObj.getSouthWestlat(), southWestlat);
    }


    // To test the North-East latitude by setting an invalid value

    @Test
    void setIsInvalidNorthEastLat() {
        Set<ConstraintViolation<GpsPoints>> violation = validator.validateValue(GpsPoints.class, "northEastlat",91.0);
        assertEquals(1, violation.size());
    }


    // To test the North-East longitude by setting an invalid value

    @Test
    void setIsInvalidNorthEastLng() {
        Set<ConstraintViolation<GpsPoints>> violation = validator.validateValue(GpsPoints.class, "northEastlng",181.0);
        assertEquals(1, violation.size());
    }


    // To test the South-West longitude by setting an invalid value

    @Test
    void setIsInvalidSouthWestLng() {
        Set<ConstraintViolation<GpsPoints>> violation = validator.validateValue(GpsPoints.class, "southWestlng",181.0);
        assertEquals(1, violation.size());
    }


    // To test the South-West latitude by setting an invalid value

    @Test
    void setIsInvalidSouthWestLat() {
        Set<ConstraintViolation<GpsPoints>> violation = validator.validateValue(GpsPoints.class, "southWestlat",91.0);
        assertEquals(1, violation.size());
    }

    // Run after each tests in the class.

    @AfterEach
    void tearDownEachTest() {
    }

    // Run after all tests in the class.

    @AfterAll
    static void tearDownTestClass() {
    }
}
