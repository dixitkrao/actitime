package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
  
public class AlertHiddenDivision {	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement month = driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
		Select m=new Select(month);
		m.selectByIndex(3);
		WebElement year = driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
		Select y=new Select(year);
		y.selectByVisibleText("1992");
		driver.findElement(By.xpath("//a[text()='13']")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		driver.findElement(By.id("renew_policy_submit")).click();
		String text = driver.findElement(By.id("policynumberError")).getText();
		System.out.println(text);
		if(text.equals("Please enter valid Policy No."))
		{ 
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
        }
        }
