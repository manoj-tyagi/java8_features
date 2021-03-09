package com.tech.java8_features.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.tech.java8_features.lambda.data.Student;
import com.tech.java8_features.lambda.data.StudentDataBase;

public class StreamsFlatMapExample {
	
	public static List<String> getStudentActivities(){
		
		 List<String> list = StudentDataBase.getAllStudents()
		           .stream()
		           .map(Student::getActivities) //each element uses a list of string so we need to flat map
		           .flatMap(List::stream)
		           .distinct()
		           .sorted()
		           .collect(Collectors.toList());
		 
		 return list;
	}
	
	public static long getStudentActivitiesCount(){
		
		 long count = StudentDataBase.getAllStudents()
		           .stream()
		           .map(Student::getActivities) //each element uses a list of string so we need to flat map
		           .flatMap(List::stream)
		           .distinct()
		           .count();
		           //.collect(Collectors.toList());
		 
		 return count;
	}

	public static void main(String[] args) {
		List<String> activities = getStudentActivities();
		System.out.println(activities);
		System.out.println(getStudentActivitiesCount());
	}

}
