package com.tech.java8_features.defaults;

public interface interface2 extends interface1{
	
	default void methodB() {
		System.out.println("methodB");
	}
	

	default void methodA() {
		System.out.println("methodA"+interface2.class);
	}


}
