package QPros_Blazedemo.QPros_Blazedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddItem extends Tests {
	
	

	 public void AddItem(WebDriver driver) throws Throwable {
		 

		 Thread.sleep(3000);
			WebElement item1 =  driver.findElement(By.xpath("//div[@id='tbodyid']//div[1]//div[1]//a[1]//img[1]"));
			item1.click();
			Thread.sleep(3000);
			WebElement addToCart = driver.findElement(By.xpath("//a[normalize-space()='Add to cart']"));
			addToCart.click();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
		  
		}

}
