package com.tech.java8_features.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {
	
	// This is unnecessary taking wrapper class Integer so unboxing is a wasted effort and unnecessary
	private static int sumOfNum(List<Integer> list) {
		
		return list.stream().reduce(0, (a,b)-> a+b);
	}
	
	// No need of unboxing
	public static int sumOfNumIntStream() {
		return IntStream.rangeClosed(1, 6).sum();
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		System.out.println(sumOfNum(list));
		System.out.println(sumOfNumIntStream());
	}

}
