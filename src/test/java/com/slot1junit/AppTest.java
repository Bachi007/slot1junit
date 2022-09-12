package com.slot1junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest{
	
	@BeforeEach
	public void beforealltestcases() {
		System.out.println("Printing before all test cases");
	}
	
	@AfterEach
	public void afteralltestcases() {
		System.out.println("Printing  after test cases");
	}
	
	@Test
	void testadding() {
		App ap=new App();
		int expected=5;
		int act=ap.adding(2, 3);
		System.out.println("this is main test");		
		assertEquals(expected,act,"it should return 6");

	}
	
	@Test
	
	void testsub() {
		
		assertEquals(3,new App().subtraction(8, 5),"subtraction should happen");
		
	}

	
	
	
	
	
	
	
}
