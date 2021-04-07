package com.Tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPStringDemo {
	@Test(dataProvider="getData")
	  public void TestCase(String fname, String lname ) {
	      System.out.println("Full name is "+fname +' '+lname);
	  }
	
	@DataProvider
	  public Object[][] getData(){
	      Object data [][] = new Object[3][2];
	      data[0][0] = "Prakash";
	      data[0][1] = "Rampalli";
	     
	      data[1][0] = "Renuka";
	      data[1][1] = "Kulkarni";
	   
	      data[2][0] = "Huzefa";
	      data[2][1] = "Kazi";
	    
	      return data;
	  }

}
