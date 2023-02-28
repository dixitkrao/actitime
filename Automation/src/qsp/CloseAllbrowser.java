package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllbrowser {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		System.out.println("Enter the title which you need to close");
		Scanner s=new Scanner(System.in);
		String expTitle = s.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		Set<String> allWh = driver.getWindowHandles();
		for(String wh:allWh) {
			driver.switchTo().window(wh);
			String actualTitle=driver.getTitle();
			if(actualTitle.contains(expTitle)) {
		if(actualTitle.equals(expTitle)) {
			
		}
		else
		{
			driver.quit();
		}
	    }
	    }
        }
	    }
