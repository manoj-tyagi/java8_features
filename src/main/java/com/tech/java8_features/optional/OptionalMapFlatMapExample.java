package com.tech.java8_features.optional;

import java.util.Optional;

import com.tech.java8_features.lambda.data.Student;
import com.tech.java8_features.lambda.data.StudentDataBase;

public class OptionalMapFlatMapExample {
	
	public static void optionalFlatMap() {
		   Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
			
		   Optional<Bike> flatMap = studentOptional.filter((s)->s.getGpa()>=3.5)
		       .flatMap(Student::getBike);
		   System.out.println(flatMap.get());
		  
	}
	
	public static void optionalFilter() {
		  
	     Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		 studentOptional.filter((s)->s.getGpa()>=3.7).ifPresent(s->System.out.println(s));
	
	}
	
  public static void optionalMap() {
		
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
	
		if(studentOptional.isPresent()) {
			 Optional<String> opt = studentOptional.filter((s)->s.getGpa()>=3.4).map(Student::getName);
			 System.out.println(opt.get());
		}
	}
	
	public static void main(String[] args) {		
		optionalFilter();
		optionalMap();
		optionalFlatMap();
	}

}
