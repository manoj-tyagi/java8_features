package com.tech.java8_features.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.tech.java8_features.lambda.data.Student;
import com.tech.java8_features.lambda.data.StudentDataBase;

public class StreamsMinMaxExample {
	
	public static int findMaxValue(List<Integer> list ) {
		
		return list.stream()
				.reduce(0, (x,y)->x>y?x:y);
			//	.reduce(1,Integer::max);
	}
	
public static Optional<Integer> findMaxValueOptional(List<Integer> list ) {
		
		return list.stream()
				.reduce( (x,y)->x>y?x:y);
			//	.reduce(1,Integer::max);
	}

	public static void main(String[] args) {
         // List<Student> allStudents = StudentDataBase.getAllStudents();
          
          List<Integer> list = Arrays.asList(6,7,8,9,10);
          int result = findMaxValue(list);
          System.out.println(result);
          
          List<Integer> list1 = new ArrayList<Integer>();
          Optional<Integer> findMaxValueOptional = findMaxValueOptional(list1);
          System.out.println(findMaxValueOptional.isPresent());
          
	}

}
