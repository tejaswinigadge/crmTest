package com.qa.Testcases;

import java.io.IOException;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.qa.Extentreport.ExtentReporterNG;
import com.qa.Pages.HomePage;
import com.qa.Pages.LoginPage;
import com.qa.base.TestBase;
import com.relevantcodes.extentreports.LogStatus;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
	}

	@Test(priority = 1)
	public void verifyloginpagetitle() {
		String title = loginpage.validateTitle();
		Assert.assertEquals(title, "webERP L ogin screen");
	}

	@Test(priority = 2)
	public void logintest() {
		loginpage.selectCompany();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority = 3)
	public void check_loginbutton_color() {
		String color = loginpage.loginbtncolor();
		System.out.println(color);
	}

	@Test(priority = 4)
	public void check_loginpage_links() {
		for (WebElement s : loginpage.findallLinks()) {
			System.out.println(s.getText());
			
		}
	}

	@AfterMethod

	public void teardown() {

		driver.quit();
	}

}
