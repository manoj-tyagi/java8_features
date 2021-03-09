package com.tech.java8_features.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamsOfAndterateAndGenerateExample {

	public static void main(String[] args) {

		Stream<String> of = Stream.of("adam","dan","julie");
		of.forEach(System.out::println);
		
		Stream.iterate(1, x->x*2).limit(10).forEach(System.out::println);
		
		Supplier<Integer> s = new Random()::nextInt;
		
		Stream.generate(s).limit(5).forEach(System.out::println);
		
	}

}
