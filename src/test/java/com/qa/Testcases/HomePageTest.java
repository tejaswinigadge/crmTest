package com.qa.Testcases;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.Pages.Customers;
import com.qa.Pages.HomePage;
import com.qa.Pages.Items;
import com.qa.Pages.LoginPage;
import com.qa.Pages.Logout;
import com.qa.Pages.Manual;
import com.qa.Pages.Suppliers;
import com.qa.base.TestBase;

public class HomePageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	Customers customer;
	Items item;
	Suppliers supplier;
	Manual manual;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority = 1)
	public void verifyhomepagetitle() {
		String title = homepage.validateHomeTitle();
		Assert.assertEquals(title, "Main Menu", "homepage title not matched");
	}

	@Test(priority = 2)
	public void verifycusterlinktest() {
		customer = homepage.clicksOncustomerslink();
	}

	@Test(priority = 3)
	public void clicksOnitemslinktest() {
		item = homepage.clicksOnitemslink();
	}

	@Test(priority = 4)
	public void clicksOnmanualtest() {
		manual = homepage.clicksOnmanual();
	}

	@Test(priority = 5)
	public void clicksOnsupplierstest() {
		supplier = homepage.clicksOnsuppliers();
	}

	@Test(priority = 6)
	public void clicksOnlogouttest() throws InterruptedException {
		homepage.clicksOnlogout();
		Thread.sleep(5000);
		Alert al = driver.switchTo().alert();
		Thread.sleep(5000);
		al.accept();
		Thread.sleep(5000);
	}

	@Test(priority = 7)
	public void clicksOnMainMenulinktest() {
		homepage = homepage.clicksOnMainMenulink();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
