package com.qa.Pages;

import org.openqa.selenium.support.PageFactory;
import com.qa.base.TestBase;

public class Customers extends TestBase {
	public Customers() {
		PageFactory.initElements(driver, this);
	}

	public String validateCustomersTitle() {
		return driver.getTitle();// Search Customers
	}

}
