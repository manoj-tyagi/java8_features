package com.tech.java8_features.streams.terminal;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.tech.java8_features.lambda.data.Student;
import com.tech.java8_features.lambda.data.StudentDataBase;

public class StreamsMinByMaxByExample {
	

	public static Optional<Student> minBy() {
		return StudentDataBase.getAllStudents().stream()
				.collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
	}

	public static void main(String[] args) {
    System.out.println(minBy().get());
	}

}
