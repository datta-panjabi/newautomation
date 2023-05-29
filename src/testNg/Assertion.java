
package testNg;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion 
{
	@Test()
	public void method1()
	{
		String expectedted ="Swag lab";
		String Actual = "Swag lab";
		String expectedtedurl ="httpSwalab";
		String Actualurl = "httpSwalab";
		
		//Assert.assertEquals(Actual, expectedted);
//		Assert.assertEquals(Actual, expectedted);
//		Assert.assertEquals(Actualurl, expectedtedurl);
		Assert.assertEquals(Actual, expectedted, "title is not matched");
	}
	

	@Test
	public void method2()
	{
		String expectedted ="Swag lab";
		String Actual = "Swag lab";
		String expectedtedurl ="httpSwalab1";
		String Actualurl = "httpSwalab1";
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(Actual, expectedted);
		//soft.assertAll();
		soft.assertEquals(Actualurl, expectedtedurl);
		soft.assertAll();
	}

}
