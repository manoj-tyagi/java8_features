package com.tech.java8_features.methodReferences;

import java.util.function.Consumer;

import com.tech.java8_features.lambda.data.Student;
import com.tech.java8_features.lambda.data.StudentDataBase;

public class ConsumerMethodReferenceExample {
	
//	static Consumer<Student> c = (s)-> System.out.println(s);	
	
	static Consumer<Student> c = System.out::println;	
	
	static Consumer<Student> c1 = Student::printListOfActivities;	

	public static void main(String[] args) {
		StudentDataBase.getAllStudents().forEach(c1);

	}

}
