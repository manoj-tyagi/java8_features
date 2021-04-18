package com.tech.java8_features.defaults;

public class C implements A,B {
	
	 @Override
	 public void print() {
        A.super.print();
    }

	 
	 public static void main(String[] args) {
		C c = new C();
		c.print();
	}
}
