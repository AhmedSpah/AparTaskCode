package QPros_Blazedemo.QPros_Blazedemo;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Tests {
	
public	WebDriver driver;
	
  @Test(priority = 1)
  public void SelectPackageKSA() {
	  
	  SelectPackageKSA KSA = new SelectPackageKSA();
	  KSA.selectPackageKsa(driver);
		
  }
  
  @Test(priority = 2)
  public void SelectPackageKU() {
	  
	  SelectPackageKuwait kuwait = new SelectPackageKuwait();
	  kuwait.selectPackageKu(driver);
	  
  }
  
  @Test(priority = 3)
  public void SelectPackageBA() throws Throwable {
	  
	  SelectPackageBahreen BA = new SelectPackageBahreen();
	  BA.selectPackageBh(driver);
		
  }
  
	  
  
  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.chromedriver().setup();
	  
	  driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.stctv.com/sa-ar");
	  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() {
	  
	//  driver.quit();
	  
  }

}
