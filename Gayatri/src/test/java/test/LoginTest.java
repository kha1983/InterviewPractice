package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class LoginTest {
	
	ExcelReader reader = new ExcelReader("./data/Full hybrid excel sheet.xlsx");
	String username =reader.getCellData("Sheet1", "User", 2);
	String password =reader.getCellData("Sheet1", "Password", 2);
	
	@Test
	public void ValidUserShoulBeAbleToLogIn()     {
		WebDriver driver=BrowserFactory.startBrowser();
		LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
		loginpage.login(username,password);
		driver.close();
		driver.quit();
	}

}



