package com.bridgelabz.mood_analyzer_project;

public class MoodAnalyzer {
	String message;

	// Default constructor
	public MoodAnalyzer() {
		super();
		// TODO Auto-generated constructor stub
	}

	// param-constructor
	public MoodAnalyzer(String message) {
		super();
		this.message = message;
	}

	public static void main(String[] args) {
		try {
			// Master
			System.out.println("Welcome to Mood Analyzer Program");

			// UC1: Object of the Mood Analyzer and calling method analysis Mood
			// MoodAnalyzer analyzer = new MoodAnalyzer();

			// TC1.1: Given “I am in Sad Mood” message Should Return SAD
			// String mood1 = analyzer.analyseMood("This is SAD Message");

			// TC1.2: Given “I am in Any Mood” message Should Return HAPPY
			// String mood2 = analyzer.analyseMood("This is ANY Message");
			// System.out.println("Mood is: " + mood1);
			// System.out.println("Mood is: " + mood2);

			// Refactor: the code to use param-constructor to call and getting output
			// Refactor TC1.1: Given “I am in Sad Mood” message Should Return SAD
			MoodAnalyzer analyzer = new MoodAnalyzer("This is SAD Message");
			System.out.println(analyzer.analyseMood());

			// Refactor TC1.2: Given “I am in Any Mood” message Should Return HAPPY
			MoodAnalyzer analyzer1 = new MoodAnalyzer("This is ANY Message");
			System.out.println(analyzer1.analyseMood());

			// UC2:Handle Exception if User Provides Invalid Mood
			// TC 2.1: Given Null Mood Should Return Happy
			// MoodAnalyzer nullAnalyzer = new MoodAnalyzer(null);
			// System.out.println(nullAnalyzer.analyseMood());
			MoodAnalyzer analyzer2 = new MoodAnalyzer("");
			System.out.println(analyzer2.analyseMood());
		} catch (MoodAnalysisException e) {
			System.out.println("Please do not pass null or empty string ");
		}
	}

	public String analyseMood() throws MoodAnalysisException {
		if (message == null) {
			throw new MoodAnalysisException("Sorry! please do not pass null");
		}
		if (message == "") {
			throw new MoodAnalysisException("Sorry! please do not pass empty string");

		}
		// Handling exception as if the user passed null
		// then we will catch the exception in catch block and program will not
		// terminate
		if (message.toUpperCase().contains(("SAD"))) {
			return "SAD";
		} else {
			return "HAPPY";
		}

	}

}
