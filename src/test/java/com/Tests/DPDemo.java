package com.Tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPDemo {
	
	
	@Test(dataProvider = "dp")
	  public void TestDP(Integer n, String s) {
	      System.out.println("The no is "+n);
	      System.out.println("The string is "+s);
	      System.out.println("-----------------------------------");
	  }
	 
	 
	  @DataProvider
	  public Object[][] dp(){
	      return new Object[][] {
	          new Object[] {1,"Sachin"},
	          new Object[] {2,"Rahul"},
	          new Object[] {3,"Virat"},
	          new Object[] {4,"Yuvi"},
	          new Object[] {5, "Mahi"}
	      };
	  }


}
