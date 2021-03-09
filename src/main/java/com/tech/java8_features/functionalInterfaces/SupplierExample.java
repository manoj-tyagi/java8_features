package com.tech.java8_features.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.tech.java8_features.lambda.data.Student;
import com.tech.java8_features.lambda.data.StudentDataBase;

public class SupplierExample {
	
	static Supplier<Student> supplier = () -> {
		return new Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball"),11);
	};
	
	static Supplier<List<Student>> studentsSupplier = () -> {
		return StudentDataBase.getAllStudents();
	};

	public static void main(String[] args) {
		Student student = supplier.get();
		System.out.println("student name:"+student.getName());
		studentsSupplier.get();

	}

}
