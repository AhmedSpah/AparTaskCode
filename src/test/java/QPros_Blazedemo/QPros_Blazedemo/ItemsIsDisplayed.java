package QPros_Blazedemo.QPros_Blazedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItemsIsDisplayed extends Tests {
	
	

	 public void IsItemsDisplayed (WebDriver driver) throws Throwable {

		 WebElement Phones = driver.findElement(By.linkText("Phones"));
		    Phones.click();
		    Thread.sleep(3000);
			boolean PhonesIsDisplayed = driver.findElement(By.xpath("//div[@id='tbodyid']//div[1]//div[1]//a[1]//img[1]")).isDisplayed();
			if(PhonesIsDisplayed) {
				System.out.println("Item is displaye");
			}else {
				System.out.println("there is no items found");
			}
			Thread.sleep(3000);
			WebElement Laptops = driver.findElement(By.linkText("Laptops"));
			Laptops.click();
			Thread.sleep(3000);
			boolean LaptopsIsDisplayed = driver.findElement(By.xpath("//div[@id='tbodyid']//div[1]//div[1]//a[1]//img[1]")).isDisplayed();
			if(LaptopsIsDisplayed) {
				System.out.println("Item is displaye");
			}else {
				System.out.println("there is no items found");
			}
			Thread.sleep(3000);
			WebElement Monitors = driver.findElement(By.linkText("Monitors"));
			Monitors.click();
			Thread.sleep(3000);
			boolean MonitorsIsDisplayed = driver.findElement(By.xpath("//div[@id='tbodyid']//div[1]//div[1]//a[1]//img[1]")).isDisplayed();
			if(MonitorsIsDisplayed) {
				System.out.println("Item is displaye");
			}else {
				System.out.println("there is no items found");
			}
		  
		}

}
