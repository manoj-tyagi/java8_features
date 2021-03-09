package com.tech.java8_features.streams.terminal;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.tech.java8_features.lambda.data.Student;
import com.tech.java8_features.lambda.data.StudentDataBase;

public class StreamsGroupingByExample {

	public static Map<String, List<Student>> groupByCustomized() {

		return StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(student -> student.getGpa() > 3 ? "Outstanding" : "Average"));
	}

	public static Map<String, List<Student>> groupBy() {

		return StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGender));
	}

	public static Map<Integer, Map<String, List<Student>>> twoLevelGrouping_1() {
		return StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGradeLevel,
				Collectors.groupingBy(student -> student.getGpa() > 3 ? "Outstanding" : "Average")));
	}
	
	
	
	public static Map<Integer, Integer> twoLevelGrouping_2() {
		return StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.summingInt(Student::getNoteBook)));
	}
	
	public static LinkedHashMap<String, Set<Student>> twoLevelGrouping_3() {
		 return StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getName,LinkedHashMap::new,
						     Collectors.toSet()));
	}

	/*public static Map<Integer, Optional<Student>> calculateTopGpa() {
		 return StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,
						     Collectors.maxBy(Comparator.comparing(Student::getGpa))));
	}*/
	
	public static Map<Integer, Object> calculateTopGpa() {
		 return StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,
						     Collectors.collectingAndThen(
						    		   Collectors.maxBy(Comparator.comparing(Student::getGpa)),Optional::get)));
	}
	
	public static void main(String[] args) {
		System.out.println(twoLevelGrouping_2());
		System.out.println(twoLevelGrouping_3());
		System.out.println(calculateTopGpa());
	}

}
