package automationpractise;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot 
{
	  static WebDriver driver;
	  public static void Screenshots(String name) throws IOException
	  {
		  TakesScreenshot ts =(TakesScreenshot) driver;
			File source	=ts.getScreenshotAs(OutputType.FILE);
			File js =new File("D:\\ScreenshotByprogram\\"+ name +".jpg");
			FileHandler.copy(source, js);
	  }
	
	
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chorme.driver", "C:\\Users\\Datta\\OneDrive\\Desktop\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Screenshots("homepage");
	    WebElement	createaccount =driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	    createaccount.click();
	    Thread.sleep(3000);
	    Screenshots("signuppage");
	    
	   
		
		
//		TakesScreenshot ts =(TakesScreenshot) driver;
//		File source	=ts.getScreenshotAs(OutputType.FILE);
//		File js =new File("D:\\ScreenshotByprogram\\Facbookloginpage.jpg");
//		FileHandler.copy(source, js);
		driver.quit();
	}

}
