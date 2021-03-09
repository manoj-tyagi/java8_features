package com.tech.java8_features.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.tech.java8_features.lambda.data.Student;
import com.tech.java8_features.lambda.data.StudentDataBase;

public class StreamsExample {
	

	public static void main(String[] args) {
		List<Student> allStudents = StudentDataBase.getAllStudents();
		
		Predicate<Student> gradePredicate = (s)->s.getGradeLevel()>=3;
		Predicate<Student> gpaPredicate = (s)->s.getGpa()>=3.9;
		
		Map<String, List<String>> studentMap = allStudents.stream()
				.filter(gradePredicate.and(gpaPredicate))
				.collect(Collectors.toMap(Student::getName, Student::getActivities));

		System.out.println(studentMap.size());

	};

}
