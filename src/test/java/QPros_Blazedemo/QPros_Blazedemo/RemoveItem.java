package QPros_Blazedemo.QPros_Blazedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RemoveItem extends Tests {
	
	

	 public void RemoveItem (WebDriver driver) throws Throwable {

		 Thread.sleep(3000);
		    driver.findElement(By.id("cartur")).click();
		    Thread.sleep(3000);
			WebElement Delete =  driver.findElement(By.xpath("//a[normalize-space()='Delete']"));
			Delete.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//li[@class='nav-item active']//a[@class='nav-link']")).click();
			Thread.sleep(3000);
		  
		}

}
