package automationpractise;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Popups 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chorme.driver", "C:\\Users\\Datta\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
//		WebElement clickme= driver.findElement(By.xpath("//button[@id=\"alertButton\"]"));
//		clickme.click();	
//		Thread.sleep(3000);
	    Alert alt	=driver.switchTo().alert();
	    alt.accept();
	    Thread.sleep(3000);
//	    
//	    WebElement fivesecondalt= driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
//	    fivesecondalt.click();
//	    Thread.sleep(7000);
//	    alt.accept();
//	    Thread.sleep(2000);
//	    
//	    TakesScreenshot ts = (TakesScreenshot)driver;
//	    File sourcefile  = ts.getScreenshotAs(OutputType.FILE);
//	     File destination = new File("D:\\ScreenshotByprogram\\alertpopup.jpg");
//	     FileHandler.copy(sourcefile, destination);
	     
	     WebElement confirmbox= driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[4]/div[2]/button"));
	     
	     confirmbox.click();
		 Thread.sleep(4000);
//		 alt.dismiss();
//		 Thread.sleep(2000);
////		 
//		 WebElement promptbox= driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[4]/div[2]/button"));
//		 promptbox.click();
//		 Thread.sleep(2000);
//		alt.getText();
//     	alt.sendKeys("abcd23@gmail.com");
//		Thread.sleep(4000);
//		 alt.dismiss();
//	     
	     
	     
	     
	     driver.quit();
	    
	    
	    
	}

}
