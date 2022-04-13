package mproject;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OneTest 
{
	WebDriver driver;
   @Test
public void mone()
{
	   WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   driver.get("https://www.amazon.com/");
	   assertEquals(driver.findElement(By.id("nav-logo-sprites")).getText(),"Amazon");
	   
	}
   @AfterMethod
   public void closure()
   {
	   driver.close();
   }
	

}
