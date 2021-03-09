package com.tech.java8_features.defaults;

public interface interface1 {
	
	default void methodA() {
		System.out.println("methodA"+interface1.class);
	}

}
