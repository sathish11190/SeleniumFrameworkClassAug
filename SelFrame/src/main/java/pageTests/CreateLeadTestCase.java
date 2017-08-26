package pageTests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Annotations;
import pageFactory.LoginPage;

public class CreateLeadTestCase extends Annotations {
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("Before Class");
		excelName="CreateLead";
	}
	


	@Test(dataProvider="getExcelData")
	public void createLead(String userName,String pwd,String cmpName,String fName,String lName,String source,String mktCampaign,String phoneNumber,

			String eMail){

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(pwd)
		.clickLoginBtn()
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
