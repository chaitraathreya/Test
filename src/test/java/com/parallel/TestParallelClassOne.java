package com.parallel;
import org.testng.annotations.Test;

import com.test.sample.TestCustomException1;

public class TestParallelClassOne extends  TestCustomException1{
	
	@Test
	public void testCaseOne() {
		
		TestCustomException1 t = new TestCustomException1();
		
		System.out.println(protected_var);
		// Printing class name and Id of the thread on using which test method got executed
		System.out.println("Test Case One in " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
	}

	@Test
	public void testCaseTwo() {
		 //Printing class name and Id of the thread on using which test method got executed
		System.out.println("Test Case two in " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
	}

}
