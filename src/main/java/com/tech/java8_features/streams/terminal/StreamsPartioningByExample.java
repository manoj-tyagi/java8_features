package com.tech.java8_features.streams.terminal;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.tech.java8_features.lambda.data.Student;
import com.tech.java8_features.lambda.data.StudentDataBase;

public class StreamsPartioningByExample {
	
	
public static Map<Boolean, Set<Student>> partioningBy_2() {
		
		Predicate<Student> gpaPredicate = s->s.getGpa()>=3.8;

		return StudentDataBase.getAllStudents().stream()
				 .collect(Collectors.partitioningBy(gpaPredicate,Collectors.toSet()));
	}
	
	public static Map<Boolean, List<Student>> partioningBy() {
		
		Predicate<Student> gpaPredicate = s->s.getGpa()>=3.8;

		return StudentDataBase.getAllStudents().stream()
				 .collect(Collectors.partitioningBy(gpaPredicate));
	}


	public static void main(String[] args) {
		
		System.out.println(partioningBy_2());

	}

}
