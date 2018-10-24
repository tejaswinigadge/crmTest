package com.qa.Pages;

import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class SourceForece extends TestBase {
	public SourceForece() {
		PageFactory.initElements(driver, this);
	}

	public String validateSourceForeceTitle() {
		return driver.getTitle();
	}
}
