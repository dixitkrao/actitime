package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement res = driver.findElement(By.partialLinkText("Resources"));
		Actions a=new Actions(driver);
		a.moveToElement(res).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		WebElement log = driver.findElement(By.id("loginspan"));
		a.doubleClick(log).perform();
        Thread.sleep(4000);
	    String title = driver.getTitle();
	    if(title.equals("Login - Vtiger"))
	    {
	    	System.out.println("Login page displayed");
	    }
	    else {
	    	System.out.println("Login page not displayed");
	    }
	    driver.close();
	    }
        }
