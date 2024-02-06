package TestNG_Assignment;
import org.testng.annotations.Test;

public class TestGroup {

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

/*<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Test">
	  <groups>
		  <run>
			  <include name="Smoke"></include>
		  </run>
		  
	  </groups>
    <classes>
      <class name="grouping.GroupDemo"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->*/