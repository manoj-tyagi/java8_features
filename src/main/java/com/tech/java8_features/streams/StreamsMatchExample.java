package com.tech.java8_features.streams;

import java.util.Arrays;
import java.util.List;

import com.tech.java8_features.lambda.data.StudentDataBase;

public class StreamsMatchExample {


	public static void main(String[] args) {

		  List<Integer> list = Arrays.asList(6,7,8,9,10);
		  
		  boolean anyMatch = list.stream().anyMatch(a->a==9);
		  System.out.println(anyMatch);

		  boolean noneMatch = list.stream().noneMatch(a->a==3);
		  System.out.println(noneMatch);
		  
		  boolean allMatch = StudentDataBase.getAllStudents().stream().allMatch(s->s.getGpa()>1);
	      System.out.println(allMatch);
	
	}

}
