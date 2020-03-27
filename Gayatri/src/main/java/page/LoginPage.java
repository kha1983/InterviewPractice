package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage{
	
		WebDriver driver;
		public LoginPage(WebDriver driver)     {
			this.driver=driver;
			}
		
			// Element Library
			@FindBy(how = How.ID, using = "username")
			WebElement UserName_Field;
			@FindBy(how = How.ID, using = "password")
			WebElement Password_Field;
			@FindBy(how = How.NAME, using = "login")
			WebElement SignInButton_Field;
			
			
			// Methods to interact with the elements
			public void login(String username,String password)                {
			UserName_Field.sendKeys(username);
			Password_Field.sendKeys(password);
			SignInButton_Field.click();
		}
			public String getPageTitle()    {
				return driver.getTitle();
			}
	}



