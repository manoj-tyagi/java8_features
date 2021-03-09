package com.tech.java8_features.streams;

import java.util.Set;
import java.util.stream.Collectors;

import com.tech.java8_features.lambda.data.Student;
import com.tech.java8_features.lambda.data.StudentDataBase;

public class StreamsMapExample {
	
	
	public static Set<String> namesList(){
		
		return StudentDataBase.getAllStudents()
				.stream()
				.map(Student::getName)
				.map(String::toUpperCase)
				.collect(Collectors.toSet());
	}

	public static void main(String[] args) {
		
		Set<String> namesList = namesList();
		
		namesList.forEach(System.out::println);
	}

}
