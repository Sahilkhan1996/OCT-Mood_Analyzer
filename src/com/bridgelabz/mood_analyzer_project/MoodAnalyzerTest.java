package com.bridgelabz.mood_analyzer_project;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
//Passed Test Case
	// Refactor: passing message via. constructor and testing with no-param method
	@Test
	public void testAnalysisMood1() {
		MoodAnalyzer analyzerTest = new MoodAnalyzer("This is SAD Message");
		String expectedMood = "Sad";
		expectedMood = expectedMood.toUpperCase();
		Assert.assertEquals(expectedMood, analyzerTest.analyseMood());
	}

	@Test
	public void testAnalysisMood2() {
		MoodAnalyzer analyzerTest = new MoodAnalyzer("This is ANY Message");
		String expectedMood = "Happy";
		expectedMood = expectedMood.toUpperCase();
		Assert.assertEquals(expectedMood, analyzerTest.analyseMood());
	}

	// Failed Test Case
	// checking with the not equals so it will be showing passed
	@Test
	public void testAnalysisMood3() {
		MoodAnalyzer analyzerTest = new MoodAnalyzer("This is SAD Message");
		String expectedMood = "happy";
		expectedMood = expectedMood.toUpperCase();
		Assert.assertNotEquals(expectedMood, analyzerTest.analyseMood());
	}

	@Test
	public void testAnalysisMood4() {
		MoodAnalyzer analyzerTest = new MoodAnalyzer("This is ANY Message");
		String expectedMood = "sad";
		expectedMood = expectedMood.toUpperCase();
		Assert.assertNotEquals(expectedMood, analyzerTest.analyseMood());
	}

	// UC2: Given Null Mood Should Return Happy
	@Test
	public void testAnalysisMood5() {
		MoodAnalyzer analyzerTest = new MoodAnalyzer(null);
		String expectedMood = "HAPPY";
		expectedMood = expectedMood.toUpperCase();
		Assert.assertEquals(expectedMood, analyzerTest.analyseMood());
	}

//	UC3: Handling custom exception and passing the test case
	@Test
	public void testAnalysisMood6() {
		MoodAnalyzer analyzerTest = new MoodAnalyzer(null);
		String expectedMood = "SAD";
		expectedMood = expectedMood.toUpperCase();
		try {
			Assert.assertEquals(expectedMood, analyzerTest.analyseMood());
		} catch (MoodAnalysisException e) {
			expectedMood = "Sad";
			expectedMood = expectedMood.toUpperCase();
			try {
				Assert.assertEquals(expectedMood, analyzerTest.analyseMood());
			} catch (MoodAnalysisException e1) {
				System.out.println("Handled Custom exception sucessfully!");
			}
			System.out.println("Handled Custom exception sucessfully!");
		}
	}

	@Test
	public void testAnalysisMood7() {
		MoodAnalyzer analyzerTest = new MoodAnalyzer("");
		String expectedMood = "SAD";
		expectedMood = expectedMood.toUpperCase();
		try {
			Assert.assertEquals(expectedMood, analyzerTest.analyseMood());
		} catch (MoodAnalysisException e) {
			expectedMood = "Sad";
			expectedMood = expectedMood.toUpperCase();
			try {
				Assert.assertEquals(expectedMood, analyzerTest.analyseMood());
			} catch (MoodAnalysisException e1) {
				System.out.println("Handled Custom exception sucessfully!");
			}
			System.out.println("Handled Custom exception sucessfully!");
		}
	}

}
