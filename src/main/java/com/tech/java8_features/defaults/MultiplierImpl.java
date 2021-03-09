package com.tech.java8_features.defaults;

import java.util.List;

public class MultiplierImpl implements Multiplier{

	@Override
	public int multiply(List<Integer> list) {
		return list.stream().reduce(1,(a,b)-> a*b);
	}
	

	public int size(List<Integer> list) {
		System.out.println("Inside Multiplier Impl class");
		return list.size();
	}

}
