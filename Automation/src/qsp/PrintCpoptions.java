package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintCpoptions {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/test/Desktop/hotel.html");
		WebElement cpAlloptions = driver.findElement(By.id("cp"));
		 Select s=new Select(cpAlloptions);
		 String text = s.getWrappedElement().getText();
		 System.out.println(text);
		 driver.close();
	}
    }
