package testngpackage1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations
{
@BeforeSuite
public static void bs()
	{
	System.out.println("Before Suite");
	}
@AfterSuite
public static void as()
	{
	System.out.println("After Suite");
	}
@BeforeTest
public static void bt()
	{
	System.out.println("Before Test");
	}
@AfterTest
public static void at()
	{
	System.out.println("After Suite");
	}
@BeforeClass
public static void bc()
	{
	System.out.println("Before Class");
	}
@AfterClass
public static void ac()
	{
	System.out.println("After Class");
	}
@Test
public static void test()
	{
	System.out.println("Test");
	}
@BeforeMethod
public static void bm()
	{
	System.out.println("Before Method");
	}
@AfterMethod
public static void am()
	{
	System.out.println("After Method");
	}
}
