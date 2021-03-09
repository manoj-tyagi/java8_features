package com.tech.java8_features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.tech.java8_features.lambda.data.Student;
import com.tech.java8_features.lambda.data.StudentDataBase;

public class StreamsFindAnyFirstExample {

	public static void main(String[] args) {
		  List<Integer> list = Arrays.asList(6,7,8,9,10);
		  Optional<Student> findAny = StudentDataBase.getAllStudents()
				  .stream()
				  .filter(s->s.getGpa()>3)
				  .findAny();
		  System.out.println(findAny.get());

	}

}
