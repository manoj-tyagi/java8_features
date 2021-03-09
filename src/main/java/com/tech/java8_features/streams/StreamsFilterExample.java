package com.tech.java8_features.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.tech.java8_features.lambda.data.Student;
import com.tech.java8_features.lambda.data.StudentDataBase;

public class StreamsFilterExample {
	
public static List<Student> filterStudents(){
		
		List<Student> allStudents = StudentDataBase.getAllStudents();
		
		allStudents
		          .stream()
		          .sorted(Comparator.comparing(Student::getName))
		          .filter(student-> student.getGender().equals("female"))
		          .collect(Collectors.toList());
		
		return allStudents;
		
	}

	public static void main(String[] args) {
		List<Student> students = filterStudents();
		System.out.println(students);

	}

}
