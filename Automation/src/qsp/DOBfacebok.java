package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DOBfacebok {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		WebElement dateList = driver.findElement(By.id("day"));
		Select d=new Select(dateList);
		d.selectByIndex(12);
		WebElement monthList = driver.findElement(By.id("month"));
		Select m=new Select(monthList);
		m.selectByIndex(3);
		WebElement yearList = driver.findElement(By.id("year"));
		Select y=new Select(yearList);
		y.selectByVisibleText("1992");		
	}
}
 