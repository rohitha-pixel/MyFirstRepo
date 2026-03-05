package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstDemo {
	public static void main (String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
	     driver.get("https://www.google.com/");
	       
	}
	
	@Test
	void test() {
		
	}

}
