package com.actitime.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
private WebElement unTbx;
public LoginPage(WebDriver driver) {
unTbx=driver.findElement(By.id("username"));
}
public void setUserName(String un) {
	unTbx.sendKeys(un);
}
}
