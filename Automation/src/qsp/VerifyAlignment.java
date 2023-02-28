package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAlignment {
	
static {
	
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/signup");
	int y1=driver.findElement(By.xpath("//input[@value='1']")).getLocation().getY();
	int y2=driver.findElement(By.xpath("//input[@value='2']")).getLocation().getY();
	int y3=driver.findElement(By.xpath("//input[@value='-1']")).getLocation().getY();
	if(y1==y2 && y2==y3)
	{
		System.out.println("all are aligned and pass");
	}
	else
		System.out.println("all are not aligned and fail");
}
}
