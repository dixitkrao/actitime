package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BbcNews {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		Thread.sleep(3000);
		List<WebElement> latNews = driver.findElements(By.xpath("//span[@class='top-list-item__bullet']/../h3"));
		int count=latNews.size();
		for(WebElement wh:latNews) {
			String text = wh.getText();
			System.out.println(text);
		}
		driver.close();
	}
}
