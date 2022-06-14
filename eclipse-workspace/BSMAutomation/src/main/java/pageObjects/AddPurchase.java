package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import TestBase.TestBase;

public class AddPurchase extends TestBase {
	
	 public void AddPurchase() {
			WebElement AddSale = driver.findElement(By.id("+ Add Sale"));
			   AddSale.click();
		}
	
	

}
