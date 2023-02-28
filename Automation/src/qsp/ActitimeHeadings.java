package qsp;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeHeadings {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[4]")).click();
		driver.findElement(By.xpath("//a[text()='About your actiTIME']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Read Service Agreement']")).click();
		Set<String> allWh = driver.getWindowHandles();
		int count = allWh.size();
		System.out.println(count);
		for(String agtab:allWh) {
			driver.switchTo().window(agtab);
		}
		List<WebElement> headings = driver.findElements(By.xpath("//h2"));
		for(WebElement allHeadings:headings) {
			System.out.println(allHeadings.getText());
		}
		driver.quit();
	    }
        }
