package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildwithPopup {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		String wh = driver.getWindowHandle();
		System.out.println(wh);
		Thread.sleep(2000);
		driver.close();
	}
}
