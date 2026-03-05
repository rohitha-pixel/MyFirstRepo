package com.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {
	
	@Test
	void test() {

	String exp_title="Opencart";
	String act_title="Opencart";
	
	if(exp_title.equals(act_title)) {

		System.out.println("test Passed");
		Assert.assertTrue(true);

	}
	else {
		
		System.out.println("test failed");	
		Assert.assertTrue(false);
	}

		Assert.assertEquals(exp_title, act_title);
		
}
    @Test
	void assertannotations() {
		Assert.assertEquals("xyz","xyz");
	}
}
