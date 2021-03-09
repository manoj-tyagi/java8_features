package com.tech.java8_features.functionalInterfaces;
import java.util.function.Function;

public class FunctionExample {
	
	static Function<String,String> f = (a)-> a.toUpperCase();

	public static void main(String[] args) {
		
		String apply = f.apply("rohit");
		System.out.println(apply);

	}

}
