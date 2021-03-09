package com.tech.java8_features.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {
	
	public static List<Integer> mapToInt(){
		return  IntStream.rangeClosed(1, 50).mapToObj((i) -> {
            return new Integer(i);
          }).collect(Collectors.toList());
	}

	public static long mapToLong(){
		return  IntStream.rangeClosed(1, 50).mapToLong((i) -> {
            return new Long(i);
          }).sum();
	}
	
	public static void main(String[] args) {
     
	}

}
