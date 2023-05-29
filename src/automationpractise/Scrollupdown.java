package automationpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollupdown
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chorme.driver", "C:\\Users\\Datta\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
		
		//Thread.sleep(6000);
//		JavascriptExecutor  om =(JavascriptExecutor) driver;
//		om.executeScript("window.scrollBy(0,200)");
//		Thread.sleep(5000);
//		om.executeScript("window.scrollBy(0,-200)");
////		
//		JavascriptExecutor js =(JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,500)");
//		Thread.sleep(4000);
		
//		JavascriptExecutor js =(JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,-500)");
		WebElement closebutton =driver.findElement(By.xpath("//button[@class='react-responsive-modal-closeButton']"));
		closebutton.click();
		JavascriptExecutor  om =(JavascriptExecutor) driver;
		om.executeScript("window.scrollBy(0,400)");
		Thread.sleep(5000);
		om.executeScript("window.scrollBy(0,-200)");
//		
		
//		// Find the element you want to scroll to
//		WebElement element = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[7]"));
//
//		// Use JavaScript to scroll to the element
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(flase);", element);
//
//		JavascriptExecutor js =(JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,500)");
//		Thread.sleep(5000);
		
//		js.executeScript("window.scrollBy(0,-500)");
//		Thread.sleep(4000);
//		
		
	}

}
