package com.tech.java8_features;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tech.java8_features.others.Calculator;


public class CalculatorTest {
	
	private static Logger logger = LoggerFactory.getLogger(CalculatorTest.class);
	
	@BeforeClass
    public static void setup(){
		logger.info("@BeforeClass executed");
    }
     
    @Before
    public void setupThis(){
    	logger.info("@Before executed");
    }
    @AfterClass
    public static void tearDown(){
		logger.info("@AfterClass executed");
    }
     
    @After
    public void afterMethod(){
    	logger.info("@After executed");
    }
     
    
     
	
		@Test
	    public void testAddition() {
	        Calculator calc = new Calculator();
	        float result = calc.add(1,1);
	        assertEquals(2.0, result,1.0);
	    }
	    
	    @Test
	    public void testGroupAssertions() {
	        int[] numbers = {0, 1, 2, 3, 4};
	       /* assertAll("numbers",
	            () -> Assertions.assertEquals(numbers[0], 0),
	            () -> Assertions.assertEquals(numbers[3], 3),
	            () -> Assertions.assertEquals(numbers[4], 4)
	        );*/
	    }
}
