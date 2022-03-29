package org.tain.test.t02.test20;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferenceTestMain {

	public static String getMessage(int order) {
		if (order < 0) {
			return "사전순으로 먼저 옵니다.";
		} else if (order == 0) {
			return "동일한 문자열입니다.";
		}
		return "사전순으로 나중에 옵니다.";
	}
	
	public static void main(String[] args) {
		ToIntBiFunction<String,String> function;
		
		function = (a,b) -> a.compareToIgnoreCase(b);
		System.out.println(">>> " + getMessage(function.applyAsInt("java8", "Java8")));
		
		function = String::compareToIgnoreCase;
		System.out.println(">>> " + getMessage(function.applyAsInt("java8", "JAVA8")));
	}
}
