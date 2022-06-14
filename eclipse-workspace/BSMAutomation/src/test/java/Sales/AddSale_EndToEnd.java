package Sales;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import TestBase.TestBase;
import reusableComponents.ExcelOperations;

public class AddSale_EndToEnd extends TestBase{
	
ExcelOperations excel1 = new ExcelOperations("AddSaleTestData");
	
	@Test (dataProvider = "vehData")
	public void insuranceCalculate(Object obj1) throws Exception {
		HashMap<String, String> testData = (HashMap<String, String>) obj1;
		
		//test.log(Status.INFO, "Test data used for execution is: "+ testData);
		//insData.enterInsurantData(testData);
		addSale.EnterAddSale(testData);
		addSale.SaveAddSale();

				//insData.clickOnNextButton();
//		vehData.enterVehicleData(testData);
//		vehData.clickOnNextButton();
		
//		insData.clickOnNextButton();
//		prodData.enterProductData(testData);
//		prodData.clickOnNextButton();
//		
//		Assert.assertEquals(priceOptions.getPriceForSelectedOption("Gold"), testData.get("PriceValidation_Gold"), "Pricing for gold plan is not matching.");
//		Assert.assertEquals(priceOptions.getPriceForSelectedOption("Silver"), testData.get("PriceValidation_Silver"), "Pricing for silver plan is not matching.");
//		Assert.assertEquals(priceOptions.getPriceForSelectedOption("Platinum"), testData.get("PriceValidation_Platinum"), "Pricing for platimum plan is not matching.");
//		Assert.assertEquals(priceOptions.getPriceForSelectedOption("Ultimate"), testData.get("PriceValidation_Ultimate"), "Pricing for ultimate plan is not matching.");
//		
//		priceOptions.selectPriceOption(testData.get("SelectOption"));

		//priceOptions.clickOnNextButton();
	}
	
	//Dataprovider method --> return object array
	@DataProvider (name = "vehData")
	public Object[][] testDataSupplier() throws Exception {
		Object[][] obj = new Object[excel1.getRowCount()][1];
		for (int i = 1; i <= excel1.getRowCount(); i++) {
			HashMap<String, String> testData = excel1.getTestDataInMap(i);
			obj[i-1][0] = testData;
		}
		return obj;
		
	}
	
	
}



