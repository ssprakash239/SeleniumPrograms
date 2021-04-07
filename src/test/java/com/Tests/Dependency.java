package com.Tests;

import org.testng.annotations.Test;

public class Dependency {

	
	@Test
	public void OpenBrowser() {
		System.out.println("Inside browser");
	}
	@Test(dependsOnMethods = {"OpenBrowser"})
	public void SignIn() {
		System.out.println("Inside sign in");
	}
	@Test(dependsOnMethods = {"SignIn"})
	public void LogOut() {
		System.out.println("Inside Logut");
	}
	@Test(dependsOnMethods = {"LogOut"})
	public void CloseBrowser() {
		System.out.println("Inside CloseBrowser");
	}
}
