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
  public void Register() throws Throwable {
	  
	  Registeration register = new Registeration();
	  register.RegisterPage(driver);
		
  }
  
  @Test(priority = 2)
  public void Login() throws Throwable {
	  
	  Login login = new Login();
	  login.LoginPage(driver);
	  
  }
  
  @Test(priority = 3)
  public void Categories() throws Throwable {
	  
	  ItemsIsDisplayed Items = new ItemsIsDisplayed();
	  Items.IsItemsDisplayed(driver);
		
  }
  
  @Test(priority = 4)
  public void AddItems() throws Throwable {
	  
	  AddItem Item = new AddItem();
	  Item.AddItem(driver);
	  
  }
  
  @Test(priority = 5)
  public void RemoveItemsFromCart() throws Throwable {
	  
	  RemoveItem ItemRemove = new RemoveItem();
	  ItemRemove.RemoveItem(driver);
	  
  }
  
  @Test(priority = 6)
  public void CompleteCheckOut() throws Throwable {
	  
	  CompleteCheckOut checkout = new CompleteCheckOut();
	  checkout.CheckOut(driver);
	  
  }
  
  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.chromedriver().setup();
	  
	  driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.demoblaze.com/");
	  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() {
	  
	//  driver.quit();
	  
  }

}
