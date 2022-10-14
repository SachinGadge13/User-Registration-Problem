package com.bridgelabz.JUnitTesting;

public class MoodAnalyser {

    public static String analyseMood(String mood) throws MoodAnalyserException {
        try {
            if (mood.length() == 0) {
                throw new MoodAnalyserException(MoodAnalyserException.type.EMPTY, "Invalid Input");
            } else if (mood.toLowerCase().contains("happy")) {
                return "Entry Successful";
            } else if (mood.toLowerCase().contains("sad")) {
                return "Entry Failed";
            } else {
                return "Invalid Input";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalyserException(MoodAnalyserException.type.NULL, "Invalid mood");
        }
    }
}