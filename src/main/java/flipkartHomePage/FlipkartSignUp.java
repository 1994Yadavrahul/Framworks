package flipkartHomePage;

import org.openqa.selenium.By;

import configs.BrowserLaunch;
import configs.Constants;

public class FlipkartSignUp
{
	public static void signup()
	{
		BrowserLaunch.chrome(Constants.URL);
		Constants.driver.findElement(By.xpath("//span[text()='Existing User? Log in']")).click();
//		Constants.driver.findElement(By.xpath("//span[text()='Enter Mobile number']")).click();
//		//Constants.driver.findElement(By.xpath("//span[text()='Enter Mobile number']")
//		Constants.driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
//		//Constants.driver.findElement(By.)
//		
		Constants.driver.findElement(By.xpath("//span[text()='Enter Email/Mobile number']")).click();
		Constants.driver.findElement(By.xpath("//span[text()='Enter Email/Mobile number']")).sendKeys("8269357019");
		
		
		
	}
	
	

}
	


