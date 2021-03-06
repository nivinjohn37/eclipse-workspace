package com.test.UnitTests;

import java.util.ArrayList;
import java.util.List;

public class DoubleLetterTest {

	public static void main(String[] args) {

		String testWord = "brook";
		List<String> testSet = new ArrayList<String>();
		for (int i = 0; i < testWord.length(); i++) {
			if (!testSet.contains(String.valueOf(testWord.charAt(i)))) {
				testSet.add(String.valueOf(testWord.charAt(i)));
			}
		}
		StringBuilder builder = new StringBuilder();
		for (Object s : testSet.toArray()) {
			builder.append((String) s);
		}
		String str = builder.toString();
		System.out.println(str);
	}

}
