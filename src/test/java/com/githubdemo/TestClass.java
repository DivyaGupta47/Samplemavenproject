package com.githubdemo;

import org.testng.annotations.Test;

public class TestClass {

	@Test(priority=0)
	public void testHello() {
		System.out.println("Hello");
	}
	
	@Test(priority=1)
	public void test2() {
		int i = 10;
		
		System.out.println("printing value:" + i);
	}

	@Test
	public void testMethod5() {
		System.out.println("Test Class 5 created");
	}
}
