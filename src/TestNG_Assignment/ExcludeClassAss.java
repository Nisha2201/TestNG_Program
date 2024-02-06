package TestNG_Assignment;

import org.testng.annotations.Test;

public class ExcludeClassAss {
	@Test(groups= {"Smoke","System"})
	 void testcase1()
	 {
		System.out.println("1");
	 }
	@Test(groups= {"System"})
	 void testcase2()
	 {
		System.out.println("2");
	 }
	@Test(groups= {"Regression","System","Smoke"})
	 void testcase3()
	 {
		System.out.println("3");
	 }
	@Test(groups= {"Integration"})
	 void testcase4()
	 {
		System.out.println("4");
	 }
	@Test(groups= {"Smoke"})
	 void testcase5()
	 {
		System.out.println("5");
	 }

}
