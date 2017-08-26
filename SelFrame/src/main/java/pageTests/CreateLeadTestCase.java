package pageTests;

import org.openqa.selenium.Platform;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Annotations;
import pageFactory.HomePage;
import pageFactory.LoginPage;

public class CreateLeadTestCase extends Annotations {
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("Before Class");
		excelName="CreateLead";
		browser="chrome";
		platform=Platform.WIN10;
		version="59.0";
	}
	


	@Test(dataProvider="getExcelData")
	public void createLead(String cmpName,String fName,String lName,String source,String mktCampaign,String phoneNumber,
			String eMail){

		new HomePage()
		.clickCRMSFA()
		.clickCreateLeadLnk()
		.enterCompanyName(cmpName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.selectSource(source)
		.selectMarktCampaign(mktCampaign)
		.enterPhoneNo(phoneNumber)
		.enterEmail(eMail)
		.clickCreateLeadBtn()
		.getCreatedLeadValue();
	}

}
