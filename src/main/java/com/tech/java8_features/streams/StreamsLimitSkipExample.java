package com.tech.java8_features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {
	
	public static Optional<Integer> limit(List<Integer> list){
		
		return list.stream().limit(2).reduce(Integer::sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    List<Integer> list = Arrays.asList(6,7,8,9,10);
	    Optional<Integer> result = limit(list);
	    System.out.println("result is "+result.get());
	    
	}

}
