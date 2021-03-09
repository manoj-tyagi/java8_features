package com.tech.java8_features.optional;

import java.util.Optional;

public class OptionalPresentExample {
	
	public static void main(String[] args) {
		 Optional<String> str = Optional.ofNullable("Hello");
		 System.out.println(str.get());
		 
		str.ifPresent((s)->System.out.println("Value is there:"+s));

	}

}
