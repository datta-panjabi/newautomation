package automationpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseactions
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chorme.driver", "C:\\Users\\Datta\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
//	    WebElement	doubleclick =driver.findElement(By.id("doubleClickBtn"));
//	    Actions s=new Actions(driver);
//	   s.doubleClick(doubleclick).perform();
	   //Thread.sleep(15000);
	   WebElement popupclose=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	   popupclose.click();
	   Thread.sleep(5000);
	   
	   WebElement fashion =driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[3]/a/div[2]/div/div"));
	   Actions as =new Actions(driver);
	   as.moveToElement(fashion).perform();	 
	   
	   WebElement menstshirt=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[3]/a/div[2]/div[2]/div[2]/div/div/div[2]/a[2]"));
	   menstshirt.click();
	   Thread.sleep(5000);
	   
	   JavascriptExecutor js= (JavascriptExecutor)driver;
	   js.executeScript("window.scrollBy(0,500)");
	   Thread.sleep(3000);
	   js.executeScript("window.scrollBy(0,200)");
	   Thread.sleep(3000);
	   js.executeScript("window.scrollBy(0,500)");
	   Thread.sleep(3000);
	   js.executeScript("window.scrollBy(0,-300)");

	   
	   

//		
//	   WebElement	click =driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button"));
//	    Actions k =new Actions(driver);
//	   k.click(click).perform();
//	   //Thread.sleep(5000);
//	   
//	   WebElement	rightclick =driver.findElement(By.id("rightClickBtn"));
//	    Actions j=new Actions(driver);
//	   j.click(rightclick).perform();
//	   //Thread.sleep(5000);
//		
//		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//		        WebElement  country = driver.findElement(By.id("box3"));
//		        WebElement  city = driver.findElement(By.id("box103"));
//		        Actions act =new Actions(driver);
//		        act.dragAndDrop(country, city).perform();
//		        
		
		
	}

}
