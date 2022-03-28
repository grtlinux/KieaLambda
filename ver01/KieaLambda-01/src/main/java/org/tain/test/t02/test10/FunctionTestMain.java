package org.tain.test.t02.test10;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionTestMain {

	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 90, 95),
			new Student("신용관", 80, 85)
		);
	
	private static void printString(Function<Student,String> function) {
		for (Student student : list) {
			System.out.println(">>> " + function.apply(student));
		}
	}
	
	private static void printInt(ToIntFunction<Student> function) {
		for (Student student : list) {
			System.out.println(">>> " + function.applyAsInt(student));
		}
	}
	
	public static void main(String[] args) {
		System.out.println("학생이름");
		printString(s -> s.getName());
		
		System.out.println("영어점수");
		printInt(s -> s.getEnglishScore());
		
		System.out.println("수학점수");
		printInt(s -> s.getMathScore());
	}
}
