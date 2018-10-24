package com.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.base.TestBase;

public class HomePage extends TestBase {

	// page factory

	@FindBy(xpath = "//a[text()='Main Menu']")
	WebElement mainmenulink;

	@FindBy(xpath = "//a[text()='Customers']")
	WebElement customerslink;

	@FindBy(xpath = "//a[text()='Items']")
	WebElement itemslink;

	@FindBy(xpath = "//a[text()='Manual']")
	WebElement manual;

	@FindBy(xpath = "//a[text()='Suppliers']")
	WebElement suppliers;

	@FindBy(xpath = "//a[text()='Logout']")
	WebElement logout;

	@FindBy(xpath = "// div[@id='AppInfoCompanyDiv']")
	WebElement xevaimg;

	@FindBy(xpath = "//a[@href='/eprocbilling/UserSettings.php']")
	WebElement demonstrationuserlink;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String validateHomeTitle() {
		return driver.getTitle();// title=Main Menu
	}

	public HomePage clicksOnMainMenulink() {
		mainmenulink.click();
		return new HomePage();
	}

	public Customers clicksOncustomerslink() {
		customerslink.click();
		return new Customers();
	}

	public Items clicksOnitemslink() {
		itemslink.click();
		return new Items();
	}

	public Manual clicksOnmanual() {
		manual.click();
		return new Manual();
	}

	public Suppliers clicksOnsuppliers() {
		suppliers.click();
		return new Suppliers();
	}

	public void clicksOnlogout() {
		logout.click();

	}
}
