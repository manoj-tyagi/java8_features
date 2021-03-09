package com.tech.java8_features.optional;

import java.util.Optional;

import com.tech.java8_features.lambda.data.Student;
import com.tech.java8_features.lambda.data.StudentDataBase;

public class OptionalOrElseExample {
	
	public static String orElse() {
		
	//	 Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		 Optional<Student> optionalStudent = Optional.ofNullable(null);
			
		 String name = optionalStudent.map(Student::getName).orElse("Default");
		 return name;
	}
	
   public static String orElseGet() {
	
	     Optional<Student> optionalStudent = Optional.ofNullable(null);
		
		 String name = optionalStudent.map(Student::getName).orElseGet(()->"Default");
		 
		 return name;
	   
	}
	
    public static String orElseThrow() {
    	

	     Optional<Student> optionalStudent = Optional.ofNullable(null);
		
		 String name = optionalStudent.map(Student::getName).orElseThrow(()-> new NullPointerException());
		 
		 return name;
	   
		
  	}
	public static void main(String[] args) {
		
		System.out.println(orElse());
		System.out.println(orElseGet());
		System.out.println(orElseThrow());
		
	}
	

}
