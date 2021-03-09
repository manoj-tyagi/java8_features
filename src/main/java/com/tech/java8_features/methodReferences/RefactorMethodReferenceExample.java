package com.tech.java8_features.methodReferences;

import java.util.function.Predicate;

import com.tech.java8_features.lambda.data.Student;
import com.tech.java8_features.lambda.data.StudentDataBase;

public class RefactorMethodReferenceExample {
	
	// static Predicate<Student> p3 = (s) -> s.getGradeLevel()>=3;
	
  static Predicate<Student> p3 = RefactorMethodReferenceExample::greaterThanGradeLevel;
	    
  public static boolean greaterThanGradeLevel(Student s) {
	 return s.getGradeLevel()>=3;  
  }

	public static void main(String[] args) {
		
		System.out.println(p3.test(StudentDataBase.studentSupplier.get()));
	}

}
