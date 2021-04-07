package com.Tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGTest {
	
	@Parameters({"Uname","Salary"})
	@Test
	public void TestOne(String Uname, String Salary) {
		System.out.println("User name is "+ Uname);
		System.out.println("Salary is "+ Salary);
		System.out.println("This is first program");
	}
	
	
}
