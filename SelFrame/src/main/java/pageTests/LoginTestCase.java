package pageTests;

import org.testng.annotations.Test;

import base.Annotations;
import pageFactory.LoginPage;

public class LoginTestCase extends Annotations {
	
	
	@Test(dataProvider="getHardCodedData")
	public void Login(String userName,String password){
		
		new LoginPage().enterUserName(userName)
		.enterPassword(password)
		.clickLoginBtn();
	}
	

	
}
