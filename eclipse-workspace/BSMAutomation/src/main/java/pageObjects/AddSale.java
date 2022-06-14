package pageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import reusableComponents.PropertiesOperations;

public class AddSale {
	public static AppiumDriver<MobileElement> driver;
	static String path = "C:\\Users\\Robin\\eclipse-workspace\\BSMAutomation\\src\\test\\resources\\testData\\AddSaleTestData.xls";
	public static HSSFWorkbook workbook;
	public static HSSFSheet worksheet;
	public static DataFormatter formatter= new DataFormatter();
	public static String file_location = "C:\\Users\\Robin\\eclipse-workspace\\BSMAutomation\\src\\test\\resources\\testData\\AddSaleTestData.xls";
	static String SheetName= "Sheet1";
	public  String Res;
	public static WebElement AddCustomer = driver.findElement(By.xpath("//android.widget.Button[@index='6']"));
	public static WebElement AddMobileno = driver.findElement(By.xpath("//android.widget.EditText[@text='Enter mobile number']"));
	//  WebElement AddName = driver.findElement(By.xpath("//android.widget.EditText[@text='Enter customer name']"));
	public static WebElement AddEmail = driver.findElement(By.xpath("//android.widget.EditText[@text='Enter email address']"));
	@Test
	public void launchandNavigate() {
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

		
	}
	@BeforeMethod
	public void setUp() {
		launchandNavigate();
	}
@Test
public void AddSaleInput() {
	
		
			
			 
				
		
			@DataProvider
			 public static Object[][] ReadVariant() throws IOException
			 {
			 FileInputStream fileInputStream= new FileInputStream(path); //Excel sheet file location get mentioned here
			 workbook = new HSSFWorkbook (fileInputStream); //get my workbook 
			 worksheet=workbook.getSheet(SheetName);// get my sheet from workbook
			       HSSFRow Row=worksheet.getRow(0);   //get my Row which start from 0   
			   
			    	int RowNum = worksheet.getPhysicalNumberOfRows();// count my number of Rows
			    	int ColNum= Row.getLastCellNum(); // get last ColNum 
			    	
			    	Object Data[][]= new Object[RowNum-1][ColNum]; // pass my  count data in array
			    	
			     for(int i=0; i<RowNum-1; i++) //Loop work for Rows
			     {  
			     HSSFRow row= worksheet.getRow(i+1);
			     
			     for (int j=0; j<ColNum; j++) //Loop work for colNum
			     {
			     if(row==null)
			     Data[i][j]= "";
			     else 
			     {
			     HSSFCell cell= row.getCell(j);
			     if(cell==null)
			     Data[i][j]= ""; //if it get Null value it pass no data 
			     else
			     {
			     String value=formatter.formatCellValue(cell);
			     Data[i][j]=value; //This formatter get my all values as string i.e integer, float all type data value
			     }
			     }
			     }
			     }
			 
			    	return Data;
			    }
			
	
		
}

