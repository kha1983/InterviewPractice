package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage extends BasePage {
	
	WebDriver driver;
			
			public DashboardPage(WebDriver driver)     {
				this.driver=driver;
				}
			// Element Library
			@FindBy(how = How.XPATH, using = "//span[text()='CRM']")
			WebElement CRM;
			@FindBy(how = How.LINK_TEXT, using = "Add Contact")
			WebElement AddContact;
			@FindBy(how=How.NAME, using="name")
			WebElement CustomerBox;
			
		public void ClickAddContact()     {
				CRM.click();
				AddContact.click();
				
			}
			public void waitForPage()     {
				waitForElement(CustomerBox,driver);
			}
			public boolean isCustomerBoxDisplayed()    {
				waitForPage();
				CustomerBox.isDisplayed();
				return true;
			}

	}


