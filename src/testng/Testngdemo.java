package testng;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Testngdemo {
	@Before
	private void beforeclass(){
		System.out.println("beforeclass");
		
		}
@AfterClass
	private void afterclass(){
		System.out.println("afterclass");
	}
  @Test
	private void test1(){
		System.out.println("test1");
	}
@Test
	private void test2(){
		System.out.println("test2");
	}
@BeforeMethod
private void beforemethod(){
	System.out.println("beforemethod");
}
	@AfterMethod
	private void aftermethod(){
		System.out.println("aftermethod");
}
}
