package com.bridgelabz.mood_analyzer_project;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
//Passed Test Case
	@Test
	public void testAnalysisMood1() {
		MoodAnalyzer analyzerTest = new MoodAnalyzer();
		String expectedMood = "Sad";
		expectedMood = expectedMood.toUpperCase();
		Assert.assertEquals(expectedMood, analyzerTest.analyseMood("This is SAD Message"));
	}

	@Test
	public void testAnalysisMood2() {
		MoodAnalyzer analyzerTest = new MoodAnalyzer();
		String expectedMood = "Happy";
		expectedMood = expectedMood.toUpperCase();
		Assert.assertEquals(expectedMood, analyzerTest.analyseMood("This is ANY Message"));
	}

	// Failed Test Case
	@Test
	public void testAnalysisMood3() {
		MoodAnalyzer analyzerTest = new MoodAnalyzer();
		String expectedMood = "happy";
		expectedMood = expectedMood.toUpperCase();
		Assert.assertEquals(expectedMood, analyzerTest.analyseMood("This is SAD Message"));
	}

	@Test
	public void testAnalysisMood4() {
		MoodAnalyzer analyzerTest = new MoodAnalyzer();
		String expectedMood = "sad";
		expectedMood = expectedMood.toUpperCase();
		Assert.assertEquals(expectedMood, analyzerTest.analyseMood("This is ANY Message"));
	}

}
