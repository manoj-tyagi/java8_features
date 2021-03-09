package com.tech.java8_features.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
	
	static BinaryOperator<Integer> multiply = (a,b)-> a*b;
	
	static Comparator<Integer> comparator = (a,b)-> a.compareTo(b);

	public static void main(String[] args) {
		Integer result = multiply.apply(3, 4);
		System.out.println(result);
	    BinaryOperator<Integer> maxBy =  BinaryOperator.maxBy(comparator);
        System.out.println("Reuslt of maxby is : "+maxBy.apply(5,6));
	}

}
