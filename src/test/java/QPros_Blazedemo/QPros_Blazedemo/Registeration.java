package QPros_Blazedemo.QPros_Blazedemo;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registeration extends Tests {
	
	

	 public void RegisterPage(WebDriver driver) throws Throwable {

		  //click on signin button
			driver.findElement(By.id("signin2")).click();
		  //UserName	
			WebElement UserName =  driver.findElement(By.id("sign-username"));
			Thread.sleep(3000);
			UserName.sendKeys("ahmedSuppah14");
		  //Password
			WebElement Password = driver.findElement(By.id("sign-password"));
			Password.sendKeys("123456");
		  //click on signin button in the dialogbox
			driver.findElement(By.xpath("//button[normalize-space()='Sign up']")).click();
		  //click ok on the alert pop up
			 String message = driver.switchTo().alert().getText();
			 System.out.println(message);
			 String expected_message = "Sign up successful.";
			 Thread.sleep(3000);
			 //Assert the successfull message is displayed
			 Assert.assertEquals(message, expected_message);
			 driver.switchTo().alert().accept();
		  
		}

}
