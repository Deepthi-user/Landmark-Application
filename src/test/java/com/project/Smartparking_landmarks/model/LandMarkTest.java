/*
 * @(#)LandMarkTest.java 1.8 06/04/20
 * Copyright (c) 2020-2021
 */

package com.project.Smartparking_landmarks.model;

import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

/**
 * LandMarkTest class is used for testing the LandMark model.
 * @author Deepthi N
 * @version 1.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest
class LandMarkTest {
    private LandMark landmarkObj;

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
        this.landmarkObj = new LandMark("1macD234", "islandbotlargethin.png", gpsObj, "stretch", "sw");
    }


    // To test the setter of landmarkId

    @Test
    @DisplayName("setLandmarkId")
    void  setLandmarkId() {
        String landmarkId = "deepthi_new";
        landmarkObj.setLandmarkId(landmarkId);
        assertSame(landmarkObj.getLandmarkId(), landmarkId);
        assertEquals(landmarkObj.getLandmarkId(),landmarkId);
    }


    // To test the setter of image

    @Test
    @DisplayName("setImage")
    void setImage() {
        String image = "islandbotlargethin.png";
        landmarkObj.setImage(image);
        assertSame(landmarkObj.getImage(), image);
        assertEquals(landmarkObj.getImage(),image);
    }


    // To test the setter of Gps points

    @Test
    @DisplayName("setGpsPoints")
    void setGpsPoints() {
        GpsPoints gps = new GpsPoints(45.543981, -122.961818, 45.543879, -122.961974);
        landmarkObj.setGpsPoints(gpsObj);
        assertEquals(landmarkObj.getGpsPoints(),gpsObj);
    }


    // To test the setter of scale

    @Test
    @DisplayName("setScale")
    void setScale() {
        String scale = "stretch";
        landmarkObj.setScale(scale);
        assertSame(landmarkObj.getScale(), scale);
        assertEquals(landmarkObj.getScale(),scale);
    }

    // To test the setter of anchor

    @Test
    @DisplayName("setAnchor")
    void setAnchor() {
        String anchor = "sw";
        landmarkObj.setAnchor(anchor);
        assertSame(landmarkObj.getAnchor(), anchor);
        assertEquals(landmarkObj.getAnchor(),anchor);
    }

    // To test the landmarkId by setting a null value

    @Test
    void setIsNullandmarkId() {
        Set<ConstraintViolation<LandMark>> violation = validator.validateValue(LandMark.class, "landmarkId","");
        assertEquals(2, violation.size());
    }

    // To test the landmarkId by setting a value with size more than maximum size

    @Test
    void setIsMaxLandmarkId() {
        Set<ConstraintViolation<LandMark>> violation = validator.validateValue(LandMark.class, "landmarkId","ddgsht2345678973666vvbxhsafa");
        assertEquals(1, violation.size());
    }

    // To test the landmarkId by setting a value with size less than minimum size

    @Test
    void setIsMinLandmarkId() {
        Set<ConstraintViolation<LandMark>> violation = validator.validateValue(LandMark.class, "landmarkId","adv");
        assertEquals(1, violation.size());
    }

    // To test the image name by setting a null value

    @Test
    void setIsNullImage() {
        Set<ConstraintViolation<LandMark>> violation = validator.validateValue(LandMark.class, "image","");
        assertEquals(3, violation.size());
    }

    // To test the image name by setting a value with size less than minimum size

    @Test
    void setIsMinImage() {
        Set<ConstraintViolation<LandMark>> violation = validator.validateValue(LandMark.class, "image","a.jpg");
        assertEquals(1, violation.size());
    }

    // To test the image name by setting a value with size more than maximum size

    @Test
    void setIsMaxImage() {
        Set<ConstraintViolation<LandMark>> violation = validator.validateValue(LandMark.class, "image","fghdykahyvjsufdddddddddddddddddddddddddddddd.jpg");
        assertEquals(1, violation.size());
    }

    // To test the image name by setting a value with invalid image format

    @Test
    void setIsInvalidImageFormat() {
        Set<ConstraintViolation<LandMark>> violation = validator.validateValue(LandMark.class, "image","abcd.xyz");
        assertEquals(1, violation.size());
    }

    // To test the scale by setting a null value

    @Test
    void setIsNullScale() {
        Set<ConstraintViolation<LandMark>> violation = validator.validateValue(LandMark.class, "scale","");
        assertEquals(2, violation.size());
    }

    // To test the scale by setting a value with size less than minimum size

    @Test
    void setIsMinScale() {
        Set<ConstraintViolation<LandMark>> violation = validator.validateValue(LandMark.class, "scale","s");
        assertEquals(1, violation.size());
    }

    // To test the scale by setting a value with size more than maximum size

    @Test
    void setIsMaxScale() {
        Set<ConstraintViolation<LandMark>> violation = validator.validateValue(LandMark.class, "scale","stretcheddddddddddddd");
        assertEquals(1, violation.size());
    }

    // To test the anchor by setting a null value

    @Test
    void setIsNullAnchor() {
        Set<ConstraintViolation<LandMark>> violation = validator.validateValue(LandMark.class, "anchor", "");
        assertEquals(2, violation.size());
    }

    // To test the anchor by setting a value with size more than maximum size

    @Test
    void setIsMaxAnchor() {
        Set<ConstraintViolation<LandMark>> violation = validator.validateValue(LandMark.class, "anchor","gsjdkkkklaanjn");
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