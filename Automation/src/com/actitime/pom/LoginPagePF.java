package com.actitime.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPagePF {
	
@FindBy(id="username")
private WebElement unTbx;

@FindBy(name="pwd")
private WebElement pwTbx;

@FindBy(id="loginButton")
private WebElement lgBtn;

public void setLogin(String un,String pw) {
	unTbx.sendKeys(un);
	pwTbx.sendKeys(pw);
	lgBtn.click();
}
}
