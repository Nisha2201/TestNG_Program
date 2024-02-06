package testngpackage1;

import org.testng.annotations.Test;

public class Enabled {

	@Test(enabled=false)
	public void tc1()
	{
		System.out.println("TC1");
	}
	@Test(enabled=true)
	public void tc2()
	{
		System.out.println("TC2");
	}
}
