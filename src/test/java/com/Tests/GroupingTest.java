package com.Tests;

import org.testng.annotations.Test;

public class GroupingTest {
	
	@Test(groups="Regression")
	public void TestCase1(){
		System.out.println("1st Test case");
		
	}
	@Test(groups= {"Regression","Smoke"})
	public void TestCase2(){
		System.out.println("2nd Test case");
		
	}
	@Test(groups="Smoke")
	public void TestCase3(){
		System.out.println("3rd Test case");
		
	}
	@Test(groups="Regression")
	public void TestCase4(){
		System.out.println("4th Test case");
		
	}
	@Test(groups="Smoke")
	public void TestCase5(){
		System.out.println("5th Test case");
		
	}
	

}
