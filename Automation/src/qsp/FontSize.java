package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FontSize {
	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String fontsize = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-size");
        System.out.println(fontsize);
        String fontweight = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-weight");
        System.out.println(fontweight);
        String color = driver.findElement(By.linkText("Forgotten password?")).getCssValue("color");
        System.out.println(color);
        String fontfamily = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-family");
        System.out.println(fontfamily);
        driver.close();
	}
}
