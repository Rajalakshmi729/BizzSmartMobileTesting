package pageObjects;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class AddSaleObjects extends TestBase {
	
	WebElement AddCustomer = driver.findElement(By.xpath("//android.widget.Button[@index='6']"));
	  WebElement AddMobileno = driver.findElement(By.xpath("//android.widget.EditText[@text='Enter mobile number']"));
	//  WebElement AddName = driver.findElement(By.xpath("//android.widget.EditText[@text='Enter customer name']"));
	   
	  WebElement AddEmail = driver.findElement(By.xpath("//android.widget.EditText[@text='Enter email address']"));


	//public EnterInsurantDataPageObjects() {
	  public AddSaleObjects() {
		PageFactory.initElements(driver, this);
	}
	
	//public void enterInsurantData(HashMap<String, String> testData) throws Exception {
	  public void EnterAddSale(HashMap<String, String> testData) throws Exception {
		AddCustomer.sendKeys(testData.get("MobileNo").toString());
		AddMobileno.sendKeys(testData.get("CustomerName"));
		AddEmail.sendKeys(testData.get("EmailId").toString());
//		cm.selectRadioButtonValue(rdo_Gender, testData.get("Insurant_gender"));
//		cm.selectDropdownOption(dd_country, testData.get("Insurant_country"));
//		txt_zipcode.sendKeys(testData.get("Insurant_zipcode"));
//		cm.selectDropdownOption(dd_occupation, testData.get("Insurant_occupation"));
//
//		//Select checkboxes for hobbies
//		cm.selectCheckBoxes(chk_hobbies, testData.get("Insurant_Hobby"));		
		
	}

	//public void clickOnNextButton() {
	  public void SaveAddSale() {
		WebElement AddSale = driver.findElement(By.id("+ Add Sale"));
		   AddSale.click();
	}

}
