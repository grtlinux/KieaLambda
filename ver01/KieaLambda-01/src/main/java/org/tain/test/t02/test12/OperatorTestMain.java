package org.tain.test.t02.test12;

import java.util.function.IntBinaryOperator;

public class OperatorTestMain {

	private static int minOrMax(int[] scores, IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(score, result);
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] scores = { 92, 85, 90, 70 };
		
		int min = minOrMax(scores, (a, b) -> {
			if (a >= b) return b;
			return a;
		});
		System.out.println(">>> min: " + min);
		
		int max = minOrMax(scores, (a, b) -> {
			if (a >= b) return a;
			return b;
		});
		System.out.println(">>> max: " + max);
	}
}
