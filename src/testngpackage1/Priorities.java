package testngpackage1;
import org.testng.annotations.Test;
public class Priorities {

	@Test(priority=1)
	public void testcase1() 
	{
		System.out.println("1");
	}
	@Test(priority=2)
	public void testcase2()
	{
		System.out.println("2");
	}
	@Test
	public void testcase3()
	{
		System.out.println("3");
	}

}
