package qsp;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
		static
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/test/Desktop/naukri.html");
			File f=new File("./data/DIXIT CV 22.docx");
			String apath = f.getAbsolutePath();
			driver.findElement(By.id("cv")).sendKeys(apath);
			Thread.sleep(2000);
			
	}
}
