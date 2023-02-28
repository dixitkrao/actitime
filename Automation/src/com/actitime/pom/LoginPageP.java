package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageP {
	
@FindBy(id="username")
private WebElement unTbx;

@FindBy(name="pwd")
private WebElement pwTbx;

@FindBy(id="loginButton")
private WebElement lgBtn;

public LoginPageP(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void setLog(String un, String pw) {
	unTbx.sendKeys(un);
	pwTbx.sendKeys(pw);
	lgBtn.click();
}
}
