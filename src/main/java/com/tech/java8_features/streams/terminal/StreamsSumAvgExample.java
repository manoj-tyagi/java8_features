package com.tech.java8_features.streams.terminal;

import java.util.stream.Collectors;

import com.tech.java8_features.lambda.data.Student;
import com.tech.java8_features.lambda.data.StudentDataBase;

public class StreamsSumAvgExample {
	
	public static int sum() {
		
		return StudentDataBase.getAllStudents().stream()
		       .collect(Collectors.summingInt(Student::getNoteBook));
	}

	public static void main(String[] args) {
              System.out.println(sum());
	}

}
