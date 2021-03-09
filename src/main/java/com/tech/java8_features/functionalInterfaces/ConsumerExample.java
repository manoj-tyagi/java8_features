package com.tech.java8_features.functionalInterfaces;
import java.util.List;
import java.util.function.Consumer;

import com.tech.java8_features.lambda.data.Student;
import com.tech.java8_features.lambda.data.StudentDataBase;
public class ConsumerExample {
	
	static Consumer<Student> c = (s)-> System.out.println(s);	
	static Consumer<Student> c1=(student)-> System.out.print(student.getName());
	static Consumer<Student> c2=(student)-> System.out.println(student.getActivities());
	
	
	public static void main(String[] args) {
		
		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach(c);
		printNameAndActivitiesFilteredByGrade(students);
		
	}


	private static void printNameAndActivitiesFilteredByGrade(List<Student> students) {
		System.out.println("Printing name and activities***");
		students.forEach(s->{
			if(s.getGradeLevel()>3) {
				c1.andThen(c2).accept(s);
			}
		});
	}
}
