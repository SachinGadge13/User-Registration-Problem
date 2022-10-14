package com.bridgelabz.JUnitTesting;
/**
 * Purpose  - Mood Analyser for user
 */

public class MoodAnalyser {

	public static String analyseMood(String mood) {
		if (mood.toLowerCase().contains("happy")) {
			return "Entry Successful";
		} else if (mood.toLowerCase().contains("sad")) {
			return "Entry Failed";
		} else return null;
	}

}