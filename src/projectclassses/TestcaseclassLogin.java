package projectclassses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestcaseclassLogin 
{
	@Test
	public  void verifyloginfunctionality()
	{
		System.setProperty("webdriver.chorme.driver", "C:\\Users\\Datta\\OneDrive\\Desktop\\chromedriver.exe");
		System.out.println("browser has opend");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("Url is entered");
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		LoginPomClasss x = new LoginPomClasss(driver);
		x.sendusername();
		System.out.println("Username is entered");
        x.sendpassword();
		System.out.println("Password is entered");
		x.clicklgnbtn();
		System.out.println("log in activity is performed");
		System.out.println("=======validation check for home page==========");
		String actualurl ="https://www.saucedemo.com/inventory.html";
        String Expectedurl = driver.getCurrentUrl();
        if(actualurl.equals(Expectedurl))
        {
        	System.out.println("Test case passed");
        }else
        {
        	System.out.println("Test case Failed");

        }
        driver.quit();
        System.out.println("browser has closed");
    	System.out.println("End of Program");

	}

}
