package com.moodanalyzer;

public class Main {
	/**
	 * In the main method we have created an object and called the methods.
	 */
	public static void main(String[] args) {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood = moodAnalyzer.analyseMood("I am Happy");
		System.out.println(mood);
		mood = moodAnalyzer.analyseMood("I am Sad");
		System.out.println(mood);
	}
}
