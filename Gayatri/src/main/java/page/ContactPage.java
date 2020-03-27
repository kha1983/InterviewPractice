package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactPage extends BasePage {
	
		WebDriver driver;
		public ContactPage(WebDriver driver)     {
			this.driver=driver;
			}
		// Element Library
		@FindBy(how = How.XPATH, using = "//*[@type='text']")
		WebElement FullName;
		@FindBy(how = How.NAME, using = "company")
		WebElement CompanyName;
		@FindBy(how = How.ID, using = "email")
		WebElement Email;
		@FindBy(how = How.ID, using = "phone")
		WebElement Phone;
		@FindBy(how = How.ID, using = "address")
		WebElement Address;
		@FindBy(how = How.ID, using = "city")
		WebElement City;
		@FindBy(how = How.ID, using = "zip")
		WebElement ZipCode;
		@FindBy(how = How.ID, using = "state")
		WebElement State;
		@FindBy(how = How.ID, using = "submit")
		WebElement Submit;
		
		public void FillUpContactForm(String name,String company,String email,String phone,String address,String city,String zip,String state)       {
			FullName.sendKeys(name);
			CompanyName.sendKeys(company);
			Email.sendKeys(email);
			Phone.sendKeys(phone);
			Address.sendKeys(address);
			City.sendKeys(city);
			ZipCode.sendKeys(zip);
			State.sendKeys(state);
			Submit.click();
			
		}
	}



