package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPassword {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String text = driver.findElement(By.id("toPasswordRecoveryPageLink")).getTagName();
		System.out.println(text);
		Thread.sleep(2000);
		String tex = driver.findElement(By.xpath("//a[@href='javascript: void(0)']")).getAttribute("href");
		System.out.println(tex);
		Thread.sleep(2000);
		driver.close();
		}
}
