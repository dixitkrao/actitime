package com.actitime.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage2 {
	private WebElement unTbx;
	private WebElement pwTbx;
	private WebElement lgBtn;

	public LoginPage2(WebDriver driver) {
		unTbx=driver.findElement(By.id("username"));
		pwTbx=driver.findElement(By.name("pwd"));
		lgBtn=driver.findElement(By.id("loginButton"));	
	}

	public void setLogin(String un,String pw) {
		unTbx.sendKeys(un);
		pwTbx.sendKeys(pw);
		lgBtn.click();
}
}