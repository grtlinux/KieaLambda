package org.tain.test.t01.sample10;

public class Student {

	private String name;
	private int englishScore;
	private int mathScore;
	
	public Student(String name, int englishScore, int mathScore) {
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}
	
	public String getName() { return this.name; }
	public int getEnglishScore() { return this.englishScore; }
	public int getMathScore() { return this.mathScore; }
}
