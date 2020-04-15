/*
 * @(#)Longitude.java 1.8 06/04/20
 * Copyright (c) 2020-2021
 */

package com.project.Smartparking_landmarks.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Creation of annotation - @Longitude
 * @author Deepthi N
 * @version 1.0
 */

@Target({ ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {LongitudeValidator.class})
public @interface Longitude {

    // Represents Error message

    String message();

    // Represents group of constraints

    Class<?>[] groups() default {};

    // Represents additional information about annotation

    Class<? extends Payload>[] payload() default {};
}

