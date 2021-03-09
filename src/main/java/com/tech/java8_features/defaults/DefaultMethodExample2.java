package com.tech.java8_features.defaults;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.tech.java8_features.lambda.data.Student;
import com.tech.java8_features.lambda.data.StudentDataBase;

public class DefaultMethodExample2 {
	
	static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
	static Comparator<Student> gpaComparator = Comparator.comparingDouble(Student::getGpa);
	static Comparator<Student> nameNullsLastComparator = Comparator.nullsFirst(nameComparator);
	
	
	public static void sortByName(List<Student> list) {
		list.sort(nameComparator);
	}
	
	public static void sortWithNullValues(List<Student> list) {
		
		list.sort(nameNullsLastComparator);
		
	}
	
   public static void comparatorChaining(List<Student> list) {
		
	   list.sort(gpaComparator.thenComparing(nameComparator));
	   
	   list.forEach(c);
	}
	
	
	
	public static Consumer<Student> c = (s)-> System.out.println(s);

	public static void main(String[] args) {
		List<Student> students = StudentDataBase.getAllStudents();
		comparatorChaining(students);
		//students.forEach(c);
		

	}

}
