package projectclassses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class Saucedemo_allelementaddtocart 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chorme.driver", "C:\\Users\\Datta\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        // Open the SauceDemo website
        driver.get("https://www.saucedemo.com/");

        // Log in with your credentials
        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

//        // Wait for the inventory page to load
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("inventory_list")));

        // Get all the product elements
        List<WebElement> products = driver.findElements(By.className("inventory_item"));

        // Add each product to the cart
        for (WebElement product : products) {
            String productName = product.findElement(By.className("inventory_item_name")).getText();
            WebElement addToCartButton = product.findElement(By.className("btn_inventory"));
            addToCartButton.click();
            System.out.println("Added " + productName + " to the cart.");
        }

        // Verify the cart has all the products
        String cartBadge = driver.findElement(By.className("shopping_cart_badge")).getText();
        String expectedCartCount = String.valueOf(products.size());
        if (cartBadge.equals(expectedCartCount)) {
            System.out.println("All products have been added to the cart successfully!");
        } else {
            System.out.println("Some products may not have been added to the cart.");
        }

        // Close the browser
        driver.quit();
    }

}
