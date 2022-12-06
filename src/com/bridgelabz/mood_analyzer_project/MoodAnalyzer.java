package com.bridgelabz.mood_analyzer_project;

public class MoodAnalyzer {
	public static void main(String[] args) {
		// Master
		System.out.println("Welcome to Mood Analyzer Program");

		// UC1: Object of the Mood Analyzer and calling method analysis Mood
		MoodAnalyzer analyzer = new MoodAnalyzer();

		// TC1.1: Given �I am in Sad Mood� message Should Return SAD
		String mood1 = analyzer.analyseMood("This is SAD Message");

		// TC1.2: Given �I am in Any Mood� message Should Return HAPPY
		String mood2 = analyzer.analyseMood("This is ANY Message");
		System.out.println("Mood is: " + mood1);
		System.out.println("Mood is: " + mood2);
	}

	public String analyseMood(String string) {
		if (string.toUpperCase().contains(("SAD"))) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	}

}
