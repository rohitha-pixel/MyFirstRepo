package com.practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertVSSoftAssert {
	
	@Test
	void test_hardassertion() {
		System.out.println("Manual Testing......");
		System.out.println("Manual Testing......");
		
		Assert.assertEquals(1,1);
		
		System.out.println("Automation Testing......");
		System.out.println("Automation Testing......");
		
	}
	
	
	
	@Test
	void test_softassertion() {
		System.out.println("Manual Testing......");
		System.out.println("Manual Testing......");
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1, 2);
	
		System.out.println("Automation Testing......");
		System.out.println("Automation Testing......");
		sa.assertAll();
		
	}

}
