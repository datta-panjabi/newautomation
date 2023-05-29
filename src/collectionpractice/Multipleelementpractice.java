package collectionpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Multipleelementpractice 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chorme.driver", "C:\\Users\\Datta\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("login-button"))));
		
		 WebElement	username =driver.findElement(By.id("user-name"));
		    username.sendKeys("standard_user");
		    username.click();
		    Thread.sleep(5000);
		    
		    WebElement password = driver.findElement(By.id("password"));
		    password.sendKeys("secret_sauce");
		    password.click();
		    Thread.sleep(5000);
		    
		    WebElement loginbtn = driver.findElement(By.id("login-button"));
		    loginbtn.click();
              List<WebElement> x = driver.findElements(By.xpath("//button[text()='Add to cart']"));	
//              WebElement  prdt1 = x.get(1);
//              prdt1.click();
              //or
              for(int i=0;i<x.size();i++)
              {
            	  x.get(i).click();
              }
		    
	}

}
