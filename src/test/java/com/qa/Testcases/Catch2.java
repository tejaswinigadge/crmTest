package com.qa.Testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.reporters.jq.TimesPanel;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Catch2 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://projects.javabykiran.com/eprocbilling/");
		List<WebElement> l = driver.findElements(By.tagName("a"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
		for (WebElement e : l) {
			System.out.println(e.getText());
		}
		System.out.println(driver.findElement(By.name("UserNameEntryField")).getAttribute("placeholder"));
	}
}