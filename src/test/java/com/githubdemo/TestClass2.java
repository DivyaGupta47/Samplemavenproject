package com.githubdemo;

import org.testng.annotations.Test;

public class TestClass2 {

	@Test
	public void testClass3() {
		
		int i = 2;
		int j = 5;
		int k = i*j;
		System.out.println("Mutiplication value:"+ k);
	}
	
	@Test
	public void testClass4() {
		
		int age1 = 19;
		int age2= 21;
		
		if (age1 >=19 && age2 <=21) {
			System.out.println("age is valid");
		}
		else {
			System.out.println("age is not valid");
		}
	}
}
