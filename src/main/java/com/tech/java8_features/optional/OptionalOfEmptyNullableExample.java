package com.tech.java8_features.optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {
	
	
	public static Optional<String> ofNullable(){
		
		return Optional.ofNullable(null);
		
	}
	

	public static Optional<String> of(){
		
		return Optional.of("hello");
		
	}


	public static Optional<String> empty(){
		
		return Optional.empty();
		
	}

	
	public static void main(String[] args) {
		
          System.out.println(ofNullable().isPresent()?ofNullable().get():null);
          
          System.out.println(of().isPresent()?of().get():null);
          
          System.out.println(empty());
	}

}
