package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class Annotations extends WdMethods {
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void beforeTest(){
		System.out.println("Before Test");
	}
	@BeforeGroups
	public void beforeGroup(){
		System.out.println("Before Group");
		
	}
	@BeforeClass
	public void beforeClass(){
		System.out.println("Before Class");
		
	}
	@BeforeMethod
	public void beforeMethod(){
		invokeApp("chrome");
	}
	@AfterMethod
	public void afterMethod(){
		//quitApp();
	}
	@AfterClass
	public void afterClass(){
		System.out.println("Before Class");
		
	}
	@AfterGroups
	public void afterGroup(){
		System.out.println("Before Group");
		
	}
	@AfterTest
	public void afterTest(){
		System.out.println("Before Test");
	}
	@AfterSuite
	public void afterSuite(){
		System.out.println("After Suite");
	}
	
	@DataProvider(name="getHardCodedData")
	public String[][] data(){
		
		String data[][]=new String[2][2];
		data[0][0]="DemoSalesManager";
		data[1][0]="crmsfa";
		data[1][0]="DemoSalesManager";
		data[1][1]="crmsfa";
		
		return data;
		
		
	}

}
