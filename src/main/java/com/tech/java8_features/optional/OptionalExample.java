package com.tech.java8_features.optional;

import java.util.Optional;

import com.tech.java8_features.lambda.data.Student;
import com.tech.java8_features.lambda.data.StudentDataBase;

public class OptionalExample {

	public static String getStudentName() {
		Student student = StudentDataBase.studentSupplier.get();
		if(student!=null)
			return student.getName();
		return null;
	}
	public static Optional<String> getStudentNameOptional() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		if(studentOptional.isPresent()) {
			return studentOptional.map(Student::getName);
		}
		return Optional.empty();
	}
	
	public static void main(String[] args) {
		System.out.println(getStudentName().length());
		
		Optional<String> name = getStudentNameOptional();
		if(name.isPresent())
			System.out.println(name.get());
		

	}

}
