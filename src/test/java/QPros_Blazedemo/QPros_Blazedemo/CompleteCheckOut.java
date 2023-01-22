package QPros_Blazedemo.QPros_Blazedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompleteCheckOut extends Tests {
	
	

	 public void CheckOut (WebDriver driver) throws Throwable {

		 Thread.sleep(3000);
		  	WebElement item1 =  driver.findElement(By.xpath("//div[@id='tbodyid']//div[1]//div[1]//a[1]//img[1]"));
			item1.click();
			Thread.sleep(3000);
			WebElement addToCart = driver.findElement(By.xpath("//a[normalize-space()='Add to cart']"));
			addToCart.click();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
			driver.findElement(By.id("cartur")).click();
			Thread.sleep(3000);
			WebElement placeOrder = driver.findElement(By.xpath("//button[normalize-space()='Place Order']"));
			placeOrder.click();
			Thread.sleep(3000);
			WebElement Name =  driver.findElement(By.id("name"));
			Thread.sleep(3000);
			Name.sendKeys("ahmed");
			WebElement Country =  driver.findElement(By.id("country"));
			Thread.sleep(3000);
			Country.sendKeys("Egypt");
			WebElement City =  driver.findElement(By.id("city"));
			Thread.sleep(3000);
			City.sendKeys("Cairo");
			WebElement CreditCard =  driver.findElement(By.id("card"));
			Thread.sleep(3000);
			CreditCard.sendKeys("12345678765432");
			WebElement Month =  driver.findElement(By.id("month"));
			Thread.sleep(3000);
			Month.sendKeys("06");
			WebElement Year =  driver.findElement(By.id("year"));
			Thread.sleep(3000);
			Year.sendKeys("2030");
			driver.findElement(By.xpath("//button[normalize-space()='Purchase']")).click();
			Thread.sleep(3000);
		  
		}

}
