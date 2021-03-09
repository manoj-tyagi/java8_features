package com.tech.java8_features.defaults;

public class Client14 implements interface1,interface4{
	

	// resolve multiple interface same method compliation issue by implementing in impl class
	public void methodA() {
		System.out.println("methodA"+Client14.class);
	}

	public static void main(String[] args) {
		Client14 client14 = new Client14();
		client14.methodA();
	}

}
