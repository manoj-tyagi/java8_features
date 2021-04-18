package com.tech.java8_features.streams.terminal;

import java.util.List;
import java.util.stream.Collectors;

import com.tech.java8_features.lambda.data.Student;
import com.tech.java8_features.lambda.data.StudentDataBase;

public class StreamsMappingExample {
	

	public static List<String> mapping() {
	/*	return StudentDataBase.getAllStudents().stream()
				.collect(Collectors.mapping(Student::getName, Collectors.toList()));*/
		
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getName).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		System.out.println(mapping());

	}

}
