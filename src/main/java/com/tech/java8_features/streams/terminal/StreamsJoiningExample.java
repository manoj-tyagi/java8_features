package com.tech.java8_features.streams.terminal;

import java.util.stream.Collectors;

import com.tech.java8_features.lambda.data.Student;
import com.tech.java8_features.lambda.data.StudentDataBase;

public class StreamsJoiningExample {
	
	public static String joining1() {
		
		return StudentDataBase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining());
	}
	
public static String joining2() {
		
		return StudentDataBase.getAllStudents().stream().map(Student::getName)
				.collect(Collectors.joining(","));
	}

public static String joining3() {
	
	return StudentDataBase.getAllStudents().stream().map(Student::getName)
			.collect(Collectors.joining(",","(",")"));
}
	public static void main(String[] args) {
     System.out.println(joining1());
     System.out.println(joining2());
     System.out.println(joining3());
	}

}
