package QPros_Blazedemo.QPros_Blazedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login extends Tests {
	
	

	 public void LoginPage(WebDriver driver) throws Throwable {

		 Thread.sleep(3000);
		  driver.findElement(By.id("login2")).click();
		  //UserNameLogin
			WebElement UserNameLogin =  driver.findElement(By.id("loginusername"));
			Thread.sleep(3000);
			UserNameLogin.sendKeys("ahmedSuppah14");
		  //PasswordLogin
			Thread.sleep(3000);
			WebElement PasswordLogin =  driver.findElement(By.id("loginpassword"));
			PasswordLogin.sendKeys("123456");
		  //click on login button in the dialogbox
			driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
			Thread.sleep(3000);
		  
		}

}
