package com.tech.java8_features.defaults;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample {

	public static void main(String[] args) {
		List<String> namesList = Arrays.asList("Rob", "Alex","Jenny","Mike","Tom");
		
		namesList.sort(Comparator.naturalOrder());
		namesList.forEach(System.out::println);

	}

}
