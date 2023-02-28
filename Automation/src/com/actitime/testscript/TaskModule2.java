package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class TaskModule2 extends BaseClass {
	@Test
	public void createTask() {
	Reporter.log("openBrowser",true);
	Assert.fail();
	}	
	@Test
	public void modifyTask() {
		Reporter.log("modifyTask",true);	
		Assert.fail();
	}
}

