package VerificationPractice;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicHardAssertPractice {
	
	//hard Assert ==> static nature ==>call through assert class
	
	//1. assertEquals()-used to verify expected & actual result, if both same then pass
	
//	String str1="Hi";
//	String str2="Hi";
//	@Test
//	public void sample() {
//		Assert.assertEquals(str2, str1);
//	}
	
	//2.assertNotEquals()-used to verify expected & actual result, if both are not same then pass
	
//	String s="abc";
//	String s1="ab";
//	@Test
//	public void Sample() {
//		Assert.assertNotEquals(s1, s);
//	}
	
	//3. assertNull()-used to verify components & textField are empty, it empty then pass
	
//	String s="Hello";
//	String s1="hell"; //failed condition
//	@Test
//	public void sample() {
//		Assert.assertNull(s1);
//	}
	
//	String s="Hello";
//	String s1=""; //failed condition
//	@Test
//	public void sample() {
//		Assert.assertNull(s1);
//	}
	
//	String s="Hello";
//	String s1=null; //pass condition
//	@Test
//	public void sample() {
//		Assert.assertNull(s1);
//	}
	
	
	//4.  assertNotNull()-used to verify components are empty,it empty then failed , if not empty then pass
	
//	String s="Hello";
//	String s1="hell"; //pass condition
//	@Test
//	public void sample() {
//		Assert.assertNotNull(s1);
//	}
	
	
	//5. assertFail()-used to intentionally fail test method
	
	String s="Hello";
	String s1="hell"; 
	@Test
	public void sample() {
		System.out.println(s);
		Assert.fail();
	}
			
			

}
