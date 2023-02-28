package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusCheckBox {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		boolean checkbox = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		if(checkbox==true)
		{
			System.out.println("checkbox selected");
		}
		else
		{
			System.out.println("checkbox unselected");
		}
		Thread.sleep(3000);
		driver.close();
	}
}
