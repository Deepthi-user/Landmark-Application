/*
 * @(#)LatitudeValidator.java 1.8 06/04/20
 * Copyright (c) 2020-2021
 */

package com.project.Smartparking_landmarks.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;
import static com.project.Smartparking_landmarks.constant.Constant.REGEX_FOR_LATITUDE;

/**
 * LatitudeValidator class uses for validating  the latitudes of Gps points
 * @author Deepthi N
 * @version 1.0
 */

public class LatitudeValidator implements ConstraintValidator<Latitude, Double> {

    /**
     * method to validate the latitude
     * @param latitude Double type
     * @param context contextual value
     * @return Boolean
     */

    @Override
    public boolean isValid(Double latitude, ConstraintValidatorContext context) {
        String latitudeStr = null;
        latitudeStr = Double.toString(latitude);
        Pattern pattern = Pattern.compile(REGEX_FOR_LATITUDE);
        boolean matches = pattern.matcher(latitudeStr).matches();
        return matches;
    }
}