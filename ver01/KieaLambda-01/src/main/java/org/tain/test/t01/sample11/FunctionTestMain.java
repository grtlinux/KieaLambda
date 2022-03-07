package org.tain.test.t01.sample11;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionTestMain {

	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 90, 96),
			new Student("신용관", 95, 93)
			);
	
	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for (Student student : list) {
			sum += function.applyAsInt(student);
		}
		double avg = (double) sum / list.size();
		return avg;
	}
	
	public static void main(String[] args) {
		double englishAvg = avg(s -> s.getEnglishScore());
		System.out.println("영어평균: " + englishAvg);
		
		double mathAvg = avg(s -> s.getMathScore());
		System.out.println("수학평균: " + mathAvg);
	}
}
