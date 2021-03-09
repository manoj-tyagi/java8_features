package com.tech.java8_features.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.tech.java8_features.lambda.data.Student;
import com.tech.java8_features.lambda.data.StudentDataBase;

public class StreamsComparatorExample {
	
	
	
	public static List<Student> sortStudentByName(){
		
		List<Student> allStudents = StudentDataBase.getAllStudents();
		
		allStudents
		          .stream()
		          .sorted(Comparator.comparing(Student::getName))
		          .collect(Collectors.toList());
		
		return allStudents;
		
	}
	
	public static List<Student> sortStudentByGpa(){
		
		List<Student> allStudents = StudentDataBase.getAllStudents();
		
		allStudents
		          .stream()
		          .sorted(Comparator.comparing(Student::getGpa).reversed())
		          .collect(Collectors.toList());
		
		return allStudents;
		
	}

	public static void main(String[] args) {
		
		List<Student> sortStudentByName = sortStudentByName();
		System.out.println(sortStudentByName);
		
	}

}
