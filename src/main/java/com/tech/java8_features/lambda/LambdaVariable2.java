package com.tech.java8_features.lambda;

import java.util.function.Consumer;

public class LambdaVariable2 {
	
	static int t = 10;

	public static void main(String[] args) {
		int value = 4;
		
	   Consumer<Integer> c1 = (i)->{
		  // value++; // error...local variable in enclosing scope should be effectively final
		  t++;
		 System.out.println("instance variable value:"+t);
		 System.out.println("value:"+i);  
	   };

	   c1.accept(value);
	   value++;// this is allowed
	   c1.accept(value);
	}

}
