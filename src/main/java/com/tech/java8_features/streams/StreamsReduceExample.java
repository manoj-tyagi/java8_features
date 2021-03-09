package com.tech.java8_features.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.tech.java8_features.lambda.data.Student;
import com.tech.java8_features.lambda.data.StudentDataBase;

public class StreamsReduceExample {

	public static int performReduce(List<Integer> list){
		return list.stream().reduce(1,(a,b)-> a*b);
		
	}
	
	public static Optional<Student> getHighestGpaStudent(){
		
		List<Student> allStudents = StudentDataBase.getAllStudents();
		return allStudents.stream().reduce((s1,s2) -> s1.getGpa()>s2.getGpa()?s1:s2);
	}
	
	
	
	public static Optional<Integer> performReduceWithOptional(List<Integer> list){
		return list.stream().reduce((a,b)-> a*b);
		
	}
	
	public static void main(String[] args) {
		List<Integer> list  = Arrays.asList(2,3,7,5);
		
		List<Integer> emptyList  = new ArrayList<>();
		
        int result = performReduce(list);
        System.out.println(result);
        
        Optional<Integer> result1 = performReduceWithOptional(emptyList);
      //  System.out.println(result1.get());//nosuchelementexcerption
        
          Optional<Student> highestGpaStudent = getHighestGpaStudent();
          if(highestGpaStudent.isPresent())
        	   System.out.println(highestGpaStudent.get().getName());
	}

}
