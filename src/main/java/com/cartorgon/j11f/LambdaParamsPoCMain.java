package com.cartorgon.j11f;

import java.util.Arrays;
import java.util.List;

import lombok.NonNull;

public class LambdaParamsPoCMain {
	
	
	private static final List<String> IN_LIST = Arrays.asList("one", "two", null, "four", "five" );
	
	public static final void main(final String args[]) {
		try {
			LambdaParamsPoCMain.secondSolution();
		} catch (final Exception excp) {
			excp.printStackTrace();
		}
	}
	
	private static void firstSolution() {
		LambdaParamsPoCMain.IN_LIST.stream()
		.map(String::toUpperCase)		
		.forEach(System.out::println)
		; 
	}
	
	private static void secondSolution() {
		LambdaParamsPoCMain.IN_LIST.stream()
		.map((@NonNull var string) -> string.toUpperCase())		
		.forEach(System.out::println)
		;
	}
	
	private static void secondSolution(@NonNull final List<String> theList) {
		theList.stream()
		.map(( var string) -> string.toUpperCase())		
		.forEach(System.out::println)
		;
	}
}