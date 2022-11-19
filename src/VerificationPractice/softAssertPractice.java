package VerificationPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertPractice {
	
	public class sample {
		
		//soft Assert ==> non static method ==>required object creation
		
		@Test
		public void test1() {
			SoftAssert soft =new SoftAssert(); //creating object of SoftAssert class
			String s="hello";
			soft.assertEquals(s, "hi");
			System.out.println(s);
		
			String s1="hi";
			soft.assertEquals(s1, "hi");
			System.out.println(s1);
			
			soft.assertAll();
		}

	}

}
