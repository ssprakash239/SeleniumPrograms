package com.Tests;

public class CharDelete {

	public static void main(String[] args) {
		
		String str = "June27summer";
		
		
		String strNew = str.replace("June", "");
		String strNew1 = strNew.replace("summer", "");
		
		System.out.println("Before replacement new string is :"+ str);
		System.out.println("After replacement new string is :"+ strNew1);


	}

}
