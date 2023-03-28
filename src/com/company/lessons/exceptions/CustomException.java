package com.company.lessons.exceptions;

public class CustomException extends Exception{

    private int errorCode;
    private String errorMessage;

    public CustomException(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getFullErrorMessage() {
        return "Error code: " + errorCode + ", Error message: " + errorMessage;
    }
}
