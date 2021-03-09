package com.tech.java8_features.methodReferences;

import java.util.function.Function;
import java.util.function.Supplier;

import com.tech.java8_features.lambda.data.Student;

public class ConstructorMethodReference {
	
  static Supplier<Student> studentSupplier =  Student::new;
  
  static Function<String,Student> studentFunction = Student::new;
	public static void main(String[] args) {
		System.out.println(studentSupplier.get());
		Student studentByFunction = studentFunction.apply("rohit");
		
		System.out.println(studentByFunction.getName());

	}

}
