package collectionpractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonchildbrowserpopup
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chorme.driver", "C:\\Users\\Datta\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		Thread.sleep(3000);
		
        WebElement tryityourself= driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[2]"));
        tryityourself.click();	
		Thread.sleep(3000);
		String adressofcamerawebpage =driver.getWindowHandle();
		System.out.println("adress of first page is"+ adressofcamerawebpage);
		System.out.println("program run till here first parent page");
		Thread.sleep(9000);
		
		  List<String> alladresses  =  new ArrayList <String>(driver.getWindowHandles());
		   System.out.println("all page adresses"+alladresses);       
		
		driver.switchTo().window(alladresses.get(1));
		WebElement getyourwebsite= driver.findElement(By.xpath("//a[@id='getwebsitebtn']"));
		getyourwebsite.click();
		Thread.sleep(8000);
		String adressofchildpage =driver.getWindowHandle();
		System.out.println("child page adress"+adressofchildpage );
		driver.quit();
		
		
		
		
	}

}
