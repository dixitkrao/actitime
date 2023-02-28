package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClassFileProperty {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    }
		public WebDriver driver;
		@BeforeTest
		public void openBrowser() {
			Reporter.log("openBrowser",true);
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		@AfterTest
		public void closeBrowser() {
			Reporter.log("closeBrowser",true);
			driver.close();
		}
		@BeforeMethod
		public void login() throws IOException {
			Reporter.log("Login",true);
			driver.get("https://demo.actitime.com/");
			FileInputStream fis=new FileInputStream("./data/commondata.property");
			Properties p=new Properties();
			p.load(fis);
			String un=p.getProperty("username");
			String pw=p.getProperty("password");
			driver.findElement(By.id("username")).sendKeys(un);
			driver.findElement(By.name("pwd")).sendKeys(pw);
			driver.findElement(By.id("loginButton")).click();
        }
		@AfterMethod
		public void logout() {
			Reporter.log("logout",true);
			driver.findElement(By.id("logoutLink")).click();
}
}