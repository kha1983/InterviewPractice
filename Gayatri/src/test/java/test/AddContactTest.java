package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.ContactPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class AddContactTest {
	
	ExcelReader reader = new ExcelReader("./data/Full hybrid excel sheet.xlsx");
	String username =reader.getCellData("Sheet1", "User", 2);
	String password =reader.getCellData("Sheet1", "Password", 2);
	String name =reader.getCellData("Sheet1", "Name", 2);
	String company =reader.getCellData("Sheet1", "Company", 2);
	String email =reader.getCellData("Sheet1", "Email", 2);
	String phone =reader.getCellData("Sheet1", "Phone", 2);
	String address =reader.getCellData("Sheet1", "Address", 2);
	String city =reader.getCellData("Sheet1", "City", 2);
	String zip =reader.getCellData("Sheet1", "Zip", 2);
	String state =reader.getCellData("Sheet1", "State", 2);
	
	@Test
	
	public void UserShouldAbleToFillUpTheForm()  throws Exception   {
		WebDriver driver=BrowserFactory.startBrowser();

//Work for LoginPage
		LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
		loginpage.login(username,password);
		
		//Validation of LoginPage
		String expectedtitle="Dashboard- TechFios Test Application - Billing";
		String actualTitle=loginpage.getPageTitle();
		Assert.assertEquals(actualTitle, expectedtitle);
		
		//Work for DashboardPage
		DashboardPage dashboard=PageFactory.initElements(driver, DashboardPage.class);
		
		//Validation and use of explicit wait
		dashboard.isCustomerBoxDisplayed();
		dashboard.ClickAddContact();
		
		//Work for ContactPage
		ContactPage contactpage=PageFactory.initElements(driver, ContactPage.class);
		
		contactpage.FillUpContactForm(name, company, email, phone, address, city, zip, state);
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}

}



