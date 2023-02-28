package com.actitime.generic;

import java.io.IOException;

public class DemoGenericLib {

	public static void main(String[] args) throws IOException {
		FileLib f= new FileLib();
		System.out.println(f.getPropertyData("username"));
		String cn = f.getExcelData("Sheet1",1,2);
		System.out.println(cn);
	    f.setExcelData("Sheet1",1,2,"pass");
        }
        }
