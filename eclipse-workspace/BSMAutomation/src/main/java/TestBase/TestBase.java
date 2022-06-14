package TestBase;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import pageObjects.AddPurchase;
import pageObjects.AddSaleObjects;


public class TestBase extends ObjectsRepo{
	@Test

	public void LaunchBrowserAndNavigate() throws Exception {
		DesiredCapabilities caps = new DesiredCapabilities();
		//caps.setCapability(AndroidMobileCapabilityType.BROWSER_NAME, "chrome");
			caps.setCapability("automationName", "UiAutomator1");
			caps.setCapability("deviceName", "vivo1812");
			caps.setCapability("udid", "4H9DZPWCWOBAMZRO"); //Give Device ID of your mobile phone
			caps.setCapability("platformName", "Android");
			caps.setCapability("platformVersion", "8.1.0");
			caps.setCapability("appPackage", "com.infinix.infinix");
			caps.setCapability("appActivity", "com.infinix.infinix.MainActivity");		//caps.setCapability("noReset", "true");
			caps.setCapability("no",true);
	        caps.setCapability("newCommandTimeout", 100000);
	        caps.setCapability("noReset", true);
	  //      caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\Robin\\Desktop\\AndroidAPK");
	       //URL url = new URL("http://0.0.0.0:4723/wd/hub");
	        URL url = new URL("http://127.0.0.1:4723/wd/hub");
	    	driver = new AppiumDriver<MobileElement>(url, caps);
	    	addPurchase.AddPurchase();
	}
	@BeforeMethod   /// it will get execute before each test method within current class
	public void setupMethod() throws Exception {
		LaunchBrowserAndNavigate();
		addSale = new AddSaleObjects();
	addPurchase =new AddPurchase();
	Thread.sleep(3000);
	
	addPurchase.AddPurchase();
	
//	vehData = new EnterVehicalDataPageObjects();
//insData = new EnterInsurantDataPageObjects();
//insData.clickOnNextButton();
//	prodData = new  EnterProductDataPageObjects();
//	priceOptions = new SelectPriceOptionsPageObjects();
	}
	@AfterMethod
	public void Execution() {
		
	}

}
