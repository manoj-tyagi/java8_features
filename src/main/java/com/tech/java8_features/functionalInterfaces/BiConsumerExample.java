package com.tech.java8_features.functionalInterfaces;
import java.util.List;
import java.util.function.BiConsumer;

import com.tech.java8_features.lambda.data.Student;
import com.tech.java8_features.lambda.data.StudentDataBase;

public class BiConsumerExample {
	
	
	public static void main(String[] args) {
		BiConsumer<String,String> c = (a,b)->{
			System.out.println(a+":"+b);
		};
		c.accept("rohit", "gupta");
		
		BiConsumer<Integer,Integer> multiply = (a,b)-> System.out.println(a*b);
		multiply.accept(3, 4);
		
		printNameAndActivities();
	}
	
	private static void printNameAndActivities() {
		
		List<Student> students = StudentDataBase.getAllStudents();
		BiConsumer<String,List<String>> biConsumer=(a,b) -> System.out.println(a+":"+b);	
		students.forEach(student-> biConsumer.accept(student.getName(),student.getActivities()));
		
	}

}
