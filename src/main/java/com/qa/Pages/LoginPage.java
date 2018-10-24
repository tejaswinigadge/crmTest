package com.qa.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {
	// page factory
	@FindBy(xpath = "//input[@name='UserNameEntryField']")
	WebElement username;

	@FindBy(xpath = "//input[@name='Password']")
	WebElement password;

	@FindBy(xpath = "//input[@name='SubmitUser']")
	WebElement loginbtn;

	@FindBy(xpath = "//a[@href='https://sourceforge.net/projects/web-erp']")
	WebElement sourcelink;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateTitle() {
		return driver.getTitle();// webERP Login screen
	}

	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.submit();
		return new HomePage();
	}

	public String loginbtncolor() {
		return loginbtn.getCssValue("color");

	}

	public void gotoSourceLink() {
		sourcelink.click();
	}

	public List<WebElement> findallLinks() {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		return links;
	}

	public void selectCompany() {
		Select select = new Select(driver.findElement(By.name("CompanyNameField")));
		select.selectByValue("0");
	}

}
