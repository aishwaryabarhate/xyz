package VerificationPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sample {
	
	@Test
	public void test1() {
		String s="hello";
		Assert.assertEquals(s, "hi"); //failed condition// In hard assert if 1 test failed then next are not execute, program will terminate
		System.out.println(s);
	
		String s1="hi";
		Assert.assertEquals(s1, "hi");
		System.out.println(s1);
	}

}
