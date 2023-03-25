package QPros_Blazedemo.QPros_Blazedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectPackageKSA extends Tests {
	
	

	 public void selectPackageKsa(WebDriver driver) throws Throwable {
		 

		 Thread.sleep(3000);
			WebElement item1 =  driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div[3]/a"));
			item1.click();
			Thread.sleep(3000);
			WebElement etisalatBtn = driver.findElement(By.id("etisalat_egy-container"));
			etisalatBtn.click();
			Thread.sleep(3000);
			WebElement next = driver.findElement(By.id("btnChoosePaymentMethod"));
			next.click();
			Thread.sleep(3000);
			WebElement phoneNumber =  driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div[3]/a"));
			phoneNumber.sendKeys("11111111");
			WebElement nextFinal = driver.findElement(By.id("btnFinalStepSubscribe"));
			nextFinal.click();
		  
		}

}
