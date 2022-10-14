package com.bridgelabz.JUnitTesting;
public class MoodAnalyserException extends Exception {

    public String message;
    public static ExceptionType type;

    public enum ExceptionType {
        EMPTY, NULL;
    }

    public MoodAnalyserException(ExceptionType type, String message) {
        this.message = message;
        this.type = type;
    }
}