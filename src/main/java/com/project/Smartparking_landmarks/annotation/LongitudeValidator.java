/*
 * @(#)LongitudeValidator.java 1.8 06/04/20
 * Copyright (c) 2020-2021
 */

package com.project.Smartparking_landmarks.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;
import static com.project.Smartparking_landmarks.constant.Constant.REGEX_FOR_LONGITUDE;

/**
 * LongitudeValidator class uses for validating  the longitudes of Gps points
 * @author Deepthi N
 * @version 1.0
 */

public class LongitudeValidator implements ConstraintValidator<Longitude, Double> {

    /**
     * method to validate the longitude
     * @param longitude Double type
     * @param context contextual value
     * @return Boolean
     */

    @Override
    public boolean isValid(Double longitude, ConstraintValidatorContext context) {
        String longitudeStr = Double.toString(longitude);
        Pattern pattern = Pattern.compile(REGEX_FOR_LONGITUDE);
        boolean matches = pattern.matcher(longitudeStr).matches();
        return matches;
    }
}
