package AparTaskCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectPackageBahreen extends Tests {
	

	public void selectPackageBh(WebDriver driver) throws Throwable {
		Thread.sleep(3000);
		WebElement item1 =  driver.findElement(By.id("country-btn"));
		item1.click();
		Thread.sleep(3000);
		WebElement Kuwait = driver.findElement(By.id("bh-contry-flag"));
		Kuwait.click();
		Thread.sleep(3000);
		WebElement selectionBtn = driver.findElement(By.id("الأساسية-selection"));
		selectionBtn.click();
		Thread.sleep(3000);
		WebElement next = driver.findElement(By.id("btnChoosePaymentMethod"));
		next.click();
		Thread.sleep(3000);
		WebElement Email =  driver.findElement(By.id("email-mobile"));
		Email.sendKeys("ahmed.mahmoud332013@gmail.com");
		Thread.sleep(3000);
		WebElement password =  driver.findElement(By.id("email-mobile"));
		password.sendKeys("11111111");
		Thread.sleep(3000);
		WebElement submit = driver.findElement(By.id("sub_form"));
		submit.click();
		
	}
}
	
