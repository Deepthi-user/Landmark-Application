/*
 * @(#)ErrorResponse.java 1.8 06/04/20
 * Copyright (c) 2020-2021
 */

package com.project.Smartparking_landmarks.utilities;

/**
 * ErrorResponse is used for getting an error message if landmarkId already exists.
 * @author Deepthi N
 * @version 1.0
 */

public class ErrorResponse {
    String errMsg;

    public  ErrorResponse(String errMsg) {
        this.errMsg = errMsg;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
