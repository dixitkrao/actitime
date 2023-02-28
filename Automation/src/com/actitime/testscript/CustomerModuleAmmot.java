package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerModuleAmmot {
	@BeforeMethod
	public void login() {
		Reporter.log("Login",true);
	}
	@AfterMethod
	public void logout() {
	Reporter.log("Logout",true);	
	}
	@Test
	public void createCustomer() {
		Reporter.log("createCustomer",true);
	}
	@Test
	public void deleteCustomer() {
		Reporter.log("deleteCustomer",true);
	}
    }
