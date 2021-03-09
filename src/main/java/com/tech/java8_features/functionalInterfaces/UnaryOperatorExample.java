package com.tech.java8_features.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	
	static UnaryOperator<String> unOp = (s)-> s.concat("default");
	
	public static void main(String[] args) {
		System.out.println(unOp.apply("rohit"));

	}

}
