package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DeleteLead extends AbstractPage {
	public DeleteLead(){
		PageFactory.initElements(eventDriver, this);		
	}
	

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	WebElement companyName;
	
	public DeleteLead enterCompanyName(String cmpName){
		type(companyName, cmpName);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	WebElement firstName;
	public DeleteLead enterFirstName(String fName){
		type(firstName,fName);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	WebElement lastName;
	
	public DeleteLead enterLastName(String lName){
		type(lastName,lName);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_dataSourceId")
	WebElement source;
	public DeleteLead selectSource(String src){
		selectByVisibleText(source, src);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_marketingCampaignId")
	WebElement marketingCampaign;
	
	public DeleteLead selectMarktCampaign(String mktCmpaign){
		selectByVisibleText(marketingCampaign, mktCmpaign);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	WebElement phoneNumber;
	
	public DeleteLead enterPhoneNo(String phNo){
		type(phoneNumber, phNo);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	WebElement email;
	
	public DeleteLead enterEmail(String eMail){
		type(email, eMail);	
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@class='smallSubmit']")
	WebElement submit;
	
	public ViewLead clickCreateLeadBtn(){
		click(submit);
		return new ViewLead();
	}
	
	
}
