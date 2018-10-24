package com.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Pages.Customers;
import com.qa.Pages.HomePage;
import com.qa.Pages.LoginPage;
import com.qa.base.TestBase;

public class CustomerPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	Customers customer;

	public CustomerPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		customer = homepage.clicksOncustomerslink();
	}

	@Test(priority = 1)
	public void verifycustomerpagetitle() {
		String title = customer.validateCustomersTitle();
		Assert.assertEquals(title, "Search Customers", "Customerpage title not matched");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
