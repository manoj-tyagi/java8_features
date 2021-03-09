package com.tech.java8_features.numericstreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreamsAggregateExample {

	public static void main(String[] args) {
		
		int sum = IntStream.rangeClosed(1, 50).sum();
		System.out.println("sum:"+sum);
		OptionalDouble max = IntStream.rangeClosed(1, 50).average();
		if(max.isPresent()) {
			System.out.println(max.getAsDouble());
		}

	}

}
