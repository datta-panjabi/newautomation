package collectionpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardactions
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chorme.driver", "C:\\Users\\Datta\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/key_presses");
		WebElement enteranykey= driver.findElement(By.xpath("//input[@id='target']"));
		Actions act = new Actions(driver);
		act.sendKeys("p").perform();
		Thread.sleep(5000);
       
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(3000);
//		act.sendKeys(Keys.ARROW_UP).perform();
//		Thread.sleep(3000);
//		act.sendKeys(Keys.CONTROL).perform();
		
		act.sendKeys(Keys.TAB);
		act.sendKeys(Keys.ENTER);
		act.sendKeys(Keys.F5);
		act.sendKeys(Keys.BACK_SPACE);
		
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		
	}

}
