package com.tech.java8_features.defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

	public static void main(String[] args) {
		Multiplier multiplier = new MultiplierImpl();
		List<Integer> list = Arrays.asList(1,3,5);
		System.out.println(multiplier.multiply(list));
		System.out.println(multiplier.size(list));
		System.out.println(Multiplier.isEmpty(list));

	}

}
