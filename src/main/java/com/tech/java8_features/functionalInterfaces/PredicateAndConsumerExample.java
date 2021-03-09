package com.tech.java8_features.functionalInterfaces;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.tech.java8_features.lambda.data.Student;
import com.tech.java8_features.lambda.data.StudentDataBase;

public class PredicateAndConsumerExample {
	
	
  private  Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;
		
  private  Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;
  
  private BiPredicate<Integer,Double> bp1 = (gradeLevel,gpa)->gradeLevel>=3 && gpa>=3.9;
  
  BiConsumer<String,List<String>> biConsumer = (name,activities)->{
	  System.out.println(name+":"+activities);
  };
  
  
	Consumer<Student> c = (s)->{
		if(p1.and(p2).test(s)) {
			biConsumer.accept(s.getName(), s.getActivities());
		}
	};

	
	void printNameAndActivities(List<Student> allStudents){
		
		allStudents.forEach(a-> c.accept(a));
		
		
	}
	
	public static void main(String[] args) {
			List<Student> allStudents = StudentDataBase.getAllStudents();
			
			PredicateAndConsumerExample instance = new PredicateAndConsumerExample();
			instance.printNameAndActivities(allStudents);
			

	}

}
