package org.tain.test.t01.sample13;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTestMain {

	private static List<Student> list = Arrays.asList(
			new Student("홍길동", "남자", 96),
			new Student("김순희", "여자", 66),
			new Student("신용관", "남자", 93),
			new Student("박한나", "여자", 83),
			new Student("홍춘향", "여자", 93)
			);
	
	public static double avg(Predicate<Student> predicate) {
		int count = 0;
		int sum = 0;
		for (Student student : list) {
			if (predicate.test(student)) {
				count++;
				sum += student.getScore();
			}
		}
		double avg = (double) sum / count;
		return avg;
	}
	
	public static void main(String[] args) {
		double maleAvg = avg(s -> s.getSex().equals("남자"));
		System.out.println("남자평균: " + maleAvg);
		
		double femaleAvg = avg(s -> s.getSex().equals("여자"));
		System.out.println("여자평균: " + femaleAvg);
	}
}
