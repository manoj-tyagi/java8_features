package com.tech.java8_features.streams.terminal;

import java.util.stream.Collectors;

import com.tech.java8_features.lambda.data.StudentDataBase;

public class StreamsCountingExample {
	
	public static long count() {
		return StudentDataBase.getAllStudents().stream()
				.filter(s->s.getGpa()>=3.9)
				.collect(Collectors.counting());
	}

	public static void main(String[] args) {
         System.out.println(count());
	}

}
