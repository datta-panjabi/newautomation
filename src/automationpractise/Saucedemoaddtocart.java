package automationpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saucedemoaddtocart 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chorme.driver", "C:\\Users\\Datta\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
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
	    
	    WebElement addtocart = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[2]/button"));
	    addtocart.click();
	    Thread.sleep(8000);
	    System.out.println("Product added to add to cart successful");
	    driver.quit();
	    
	    
//	   String currenturl= driver.getCurrentUrl();
//	    System.out.println(currenturl);
//	   String actualurl= "https://www.saucedemo.com/inventory.html";
//	   System.out.println(actualurl);
//	   if(actualurl.equals(actualurl))
//	   {
//		   System.out.println("You are getting right Url");
//	   }else
//	   {
//		   System.out.println("Url is Wrong");
//	   }
//	    WebElement optn = driver.findElement(By.id("react-burger-menu-btn"));
//	    optn.click();
//	    
//	   WebElement logoutbtn = driver.findElement(By.className("bm-item menu-item"));
//	   logoutbtn.click();
	    
	   
	   
	   driver.quit();	   
	    
	    
		
	}

}
