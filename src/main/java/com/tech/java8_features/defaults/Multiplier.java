package com.tech.java8_features.defaults;

import java.util.List;

public interface Multiplier {
	
	int multiply(List<Integer> list);
	
	public default int size(List<Integer> list) {
		System.out.println("Inside Multiplier Interface");
		return list.size();
	}
	static boolean isEmpty(List<Integer> list) {
		return list.size()>=0?false:true;
	}

}