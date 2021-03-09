package com.tech.java8_features.functionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.tech.java8_features.lambda.data.Student;
import com.tech.java8_features.lambda.data.StudentDataBase;

public class FunctionStudentExample {
	
	private static Function<List<Student>,Map<String,Double>> studentFunction=(students)->{
		Map<String,Double> studentGradeMap = new HashMap();
		students.forEach(s->{
			if(PredicateExample.p3.test(s))
			  studentGradeMap.put(s.getName(), s.getGpa());
		});
		return studentGradeMap;
	};

	public static void main(String[] args) {
		
		System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
	}

}
