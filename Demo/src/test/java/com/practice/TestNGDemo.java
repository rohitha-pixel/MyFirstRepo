package com.practice;

import org.testng.annotations.Test;

public class TestNGDemo {
	
	/*1.open the application
	 * 2.login to application
	 * 3.logout from the application
	 */
	
	
	@Test(priority=2)
	void openApp() {
		System.out.println("Opening the application");
	} 
	
	@Test(priority=1)
	void login() {
		System.out.println("login to the application");
	}
	
	@Test(priority=3)
	void logout() {
		System.out.println("logout from the application");
	}
}
