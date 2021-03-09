package com.tech.java8_features.functionalInterfaces;
import java.util.List;
import java.util.function.Predicate;

import com.tech.java8_features.lambda.data.Student;
import com.tech.java8_features.lambda.data.StudentDataBase;

public class PredicateExample {
	 static Predicate<Integer> p = (i)-> {return (i%2==0);};
	
	 static Predicate<Integer> p1 = (i)-> i%2==0; // If lambda body has a single statement or an expression we dont need curly braces and return statement
	
	 static Predicate<Integer> p2 = (i)-> i%5==0; 
	
     public static Predicate<Student> p3 = (s) -> s.getGradeLevel()>=3;
    

	
	public static void main(String[] args) {
		
		System.out.println(p.test(4));
		
		filterByGradeLevel();
		predicateAnd();
	
	}
	
	private static void predicateAnd() {
	
		System.out.println(p1.and(p2).test(10));
		System.out.println(p1.or(p2).test(9));
	}
	
	public static void filterByGradeLevel() {
		
		List<Student> allStudents = StudentDataBase.getAllStudents();
		
		allStudents.forEach(s->{
			if(p3.test(s)) {
			   System.out.println(s.getName());
			}
		});
	  
	}

}
