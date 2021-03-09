package com.tech.java8_features.functionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.tech.java8_features.lambda.data.Student;
import com.tech.java8_features.lambda.data.StudentDataBase;

public class BiFunctionExample {
	
	static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> biFunction=
			    (students,studentPredicate)->{
			    	Map<String,Double> map = new HashMap();
			    	
			    	students.forEach(s->{
			    		if(studentPredicate.test(s)) {
			    			map.put(s.getName(), s.getGpa());
			    		}
			    	});
			    	return map;
			    };

	public static void main(String[] args) {
		System.out.println(biFunction.apply(StudentDataBase.getAllStudents(),PredicateExample.p3));

	}

}
