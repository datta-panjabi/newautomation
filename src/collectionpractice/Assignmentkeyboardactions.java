package collectionpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignmentkeyboardactions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chorme.driver", "C:\\Users\\Datta\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://text-compare.com/");
	   
		WebElement	textbox1 =driver.findElement(By.xpath("//textarea[@id='inputText1']"));
	    textbox1.click();
	    
	    textbox1.sendKeys("Hello this is me");
	    
	    Actions act = new Actions(driver);
	    act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	    act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
	    
	    WebElement	textbox2 =driver.findElement(By.xpath("//textarea[@id='inputText2']"));
	    textbox2.click();
	    
	    act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	    
	    WebElement comparebtn =driver.findElement(By.xpath("//button[@id='compareButton']"));
	    comparebtn.click();
	    
	    WebElement comparebtnbox =driver.findElement(By.xpath("/html/body/div[2]/span[3]"));
	      String expectedmsg= comparebtnbox.getAttribute("value");
	     
	      String actualmsg= "The two texts are identical!";
	      if((textbox1.getAttribute("value").equals(textbox2.getAttribute("value"))))
	      {
	    	  System.out.println("validation successfull");//The two texts are identical!
	      }else
	      {
	    	  System.out.println("validation faild");
	      }
    
	
	
		
	}

}
