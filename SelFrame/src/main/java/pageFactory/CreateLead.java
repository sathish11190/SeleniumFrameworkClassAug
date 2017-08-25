package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateLead extends AbstractPage {
	public CreateLead(){
		PageFactory.initElements(eventDriver, this);		
	}
	

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	WebElement companyName;
	
	public CreateLead enterCompanyName(){
		type(companyName, "CurrentlyGlobally");
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	WebElement firstName;
	public CreateLead enterFirstName(){
		type(firstName, "Sathish");
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	WebElement lastName;
	
	public CreateLead enterLastName(){
		type(lastName,"Natarajan");
		return this;
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_dataSourceId")
	WebElement source;
	public CreateLead selectSource(){
		selectByVisibleText(source, "Conference");
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_marketingCampaignId")
	WebElement marketingCampaign;
	
	public CreateLead selectMarktCampaign(){
		selectByVisibleText(marketingCampaign, "Affiliate Sites");
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	WebElement phoneNumber;
	
	public CreateLead enterPhoneNo(){
		type(phoneNumber, "1234567890");
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	WebElement email;
	
	public CreateLead enterEmail(){
		type(email, "test@gmail.com");	
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@class='smallSubmit']")
	WebElement submit;
	
	public ViewLead clickCreateLeadBtn(){
		click(submit);
		return new ViewLead();
	}
	
	
}
