package collectionpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframehandling 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chorme.driver", "C:\\Users\\Datta\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	WebElement	iframeelementtwo =driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(iframeelementtwo);
		WebElement	iframeelementthree =driver.findElement(By.xpath("//iframe[@id='frame3']"));
		driver.switchTo().frame(iframeelementthree);
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='a']"));
		checkbox.click();	
		Thread.sleep(5000);
		driver.quit();
		
	}

}
