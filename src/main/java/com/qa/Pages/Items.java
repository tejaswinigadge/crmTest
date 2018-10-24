package com.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class Items extends TestBase {
	public Items() {
		PageFactory.initElements(driver, this);
	}

	public String validateItemsTitle() {
		return driver.getTitle();
	}
}
