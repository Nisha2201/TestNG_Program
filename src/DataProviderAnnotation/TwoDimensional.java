package DataProviderAnnotation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TwoDimensional 
{
@DataProvider(name="Login")
	public Object[][] method123()
	{
	
	Object[][] o1=new Object[2][2];
	o1[0][0] = "nisha@test.com";
	o1[0][1] = "nisha123";
	o1[1][0] = "ramu@test.com";
	o1[1][1] = "nitya123";
	return o1;
	}
@Test (dataProvider = "Login")
public void scenario1(String un, String pwd) throws InterruptedException
{
	
	ChromeDriver d1 = new ChromeDriver();
	d1.get("https://www.facebook.com/");
	d1.manage().window().maximize();
	
	WebElement useridfield = d1.findElement(By.id("email"));
	useridfield.sendKeys(un);
	WebElement passfield = d1.findElement(By.id("pass"));
	passfield.sendKeys(pwd);
	Thread.sleep(3000);
	d1.quit();
//System.out.println(un);	
//System.out.println(pwd);	
}



}