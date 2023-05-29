package testNg;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import projectclassses.LoginPomClasss;
import projectclassses.Logoutpomclass;

public class Testbaseclass 
{
	WebDriver driver;
	 @BeforeClass
	public void login( )
	{
		    System.setProperty("webdriver.chorme.driver", "C:\\Users\\Datta\\OneDrive\\Desktop\\chromedriver.exe");
		    System.out.println("browser has opend");
		     driver = new ChromeDriver();
	       driver.get("https://www.saucedemo.com/");
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       System.out.println("Url is entered");
	       driver.manage().window().maximize();
	       System.out.println("Browser is maximized");
	
	}
	
	@BeforeMethod
	public void enteridpass()
	{
		  LoginPomClasss x = new LoginPomClasss(driver);
		  x.sendusername();
		  System.out.println("Username is entered");
	      x.sendpassword();
	      System.out.println("Password is entered");
		  x.clicklgnbtn();
		  System.out.println("log in activity is performed");
		
	}
	
	@AfterMethod
	public void logout()
	{
		//creating object of the logout class
	    Logoutpomclass js = new Logoutpomclass(driver);
				
		//click on option button
		js.clickoptionbutton();
		System.out.println("clicked on opotioins button");
			    
		//y.clicklogoutbtn();
		js.clicklogoutbtn();
		System.out.println("clicked on Logout button");

	    System.out.println("Logout activity is performed");
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
        System.out.println("browser has closed");
    	System.out.println("End of Program");

	}

}
