package com.tech.java8_features.defaults;

public class Client123 implements interface1,interface2,interface3 {
	

	public void methodA() {
		System.out.println("methodA"+Client123.class);
	}
	// class that implements the interface
	// subinterface that extends the interface

	public static void main(String[] args) {
		
		Client123 client123 = new Client123();
		client123.methodA();//resolve to child implementation
		client123.methodB();
		client123.methodC();

	}

}
