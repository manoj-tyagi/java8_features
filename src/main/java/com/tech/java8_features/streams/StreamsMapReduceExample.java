package com.tech.java8_features.streams;

import com.tech.java8_features.lambda.data.Student;
import com.tech.java8_features.lambda.data.StudentDataBase;

public class StreamsMapReduceExample {
	
	private static int noOfNoteBooks() {
		return StudentDataBase.getAllStudents()
		       .stream()
		       .filter(s->s.getGradeLevel()>3)
		       .filter(s->s.getGender().equals("female"))
		       .map(Student::getNoteBook)
		      // .reduce(0,(a,b)->a+b);
		       .reduce(0, Integer::sum);
		
	}
	
	public static void main(String[] args) {
		System.out.println(noOfNoteBooks());
	}

}
