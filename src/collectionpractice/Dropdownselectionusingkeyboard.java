package collectionpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownselectionusingkeyboard 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chorme.driver", "C:\\Users\\Datta\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	WebElement	iframeelement =driver.findElement(By.xpath("//iframe[@id=\"frame2\"]"));
		driver.switchTo().frame(iframeelement);
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='animals']"));
		dropdown.click();
	Select sc= new Select(dropdown);
		sc.selectByVisibleText("Baby Cat");
		System.out.println("switching to paremt frame");
		driver.switchTo().parentFrame();
		System.out.println("switched to paremt frame");
		WebElement	iframeelement2 =driver.findElement(By.xpath("/html/body/iframe"));
		driver.switchTo().frame(iframeelement2);
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='a']"));
		checkbox.click();		
	}

}
