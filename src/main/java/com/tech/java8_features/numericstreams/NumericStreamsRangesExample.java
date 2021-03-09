package com.tech.java8_features.numericstreams;

import java.util.stream.IntStream;

public class NumericStreamsRangesExample {

	public static void main(String[] args) {
		
		IntStream intStream = IntStream.range(1, 50);
		IntStream.range(1, 50).forEach(System.out::println);
		IntStream.rangeClosed(1, 50).forEach(System.out::println);
		
		IntStream.rangeClosed(1, 50).asDoubleStream().forEach(System.out::println);
	}

}
