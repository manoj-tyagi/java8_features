package com.tech.java8_features.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnboxingExample {
	
	public static List<Integer> boxing() {
		
	
	   return IntStream.rangeClosed(1, 50)
			   .boxed()
			   .collect(Collectors.toList());
	   
	}
    public static int unBoxing(List<Integer> intList) {
		
    	return intList.stream().mapToInt(Integer::intValue).sum();
    	
	}
	public static void main(String[] args) {
		
		List<Integer> intList = boxing();
		int sum = unBoxing(intList);
		System.out.println(sum);
	}

}
