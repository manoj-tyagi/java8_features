package com.tech.java8_features.parallelstreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {
	
	public static long measurePerformance(Supplier<Integer> supplier,int num)
	{
		long start = System.currentTimeMillis();
		for(int i=0;i<num;i++) {
			supplier.get();
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
	
	
	public static int parallelSum() {	
		  return IntStream.rangeClosed(1, 100000).parallel().sum();
		}
	
	
	public  static int seqSum() {	
	  return IntStream.rangeClosed(1, 100000).sum();
	}

	public static void main(String[] args) {
		
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println(measurePerformance(ParallelStreamExample::seqSum,200));

		System.out.println(measurePerformance(ParallelStreamExample::parallelSum,200));
		
		
	}

}
