package testngpackage1;

import org.testng.annotations.Test;

public class Grouping_TestNG {

	@Test (groups={"Smoke","System"})
	public void testcase1()
		{
		System.out.println("Testcase1");
		}
	@Test(groups=("Smoke"))
	public void testcase2()
		{
		System.out.println("Testcase2");
		}
	@Test(groups=("Regression"))
	public void testcase3()
		{
		System.out.println("Testcase3");
		}
	@Test(groups=("Regression"))
	public void testcase4()
		{
		System.out.println("Testcase4");
		}
	@Test(groups={"Regression","Smoke"})
	public void testcase5()
		{
		System.out.println("Testcase5");
		}
}
