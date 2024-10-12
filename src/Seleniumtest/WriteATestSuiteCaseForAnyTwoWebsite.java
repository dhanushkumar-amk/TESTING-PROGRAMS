package Seleniumtest;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteATestSuiteCaseForAnyTwoWebsite {
    private static WebDriver driver;
    @BeforeClass
    public static void setUp()
    {
        // Set path for ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }


    @Test
    public void testProductSearch()
    {
        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15 pro");
        driver.findElement(By.id("nav-search-submit-button")).click();

        WebElement productTitle = driver.findElement(By.cssSelector(".a-section"));
        Assert.assertTrue(productTitle.getText().contains("iphone 15 pro"));
    }
    // Test Case 2: Add Product to Cart for Example E-Commerce
    @Test
    public void testAddProductToCart()
    {
        driver.get("https://www.flipkart.com/search?q=laptop-hp&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
        driver.findElement(By.cssSelector(".A8uQAd")).click();

        WebElement notification = driver.findElement(By.cssSelector(".vYpSTw"));
        Assert.assertEquals(notification.getText(), "COMPARE");
    }



    @AfterClass
    public  static  void tearDown()
    {
        driver.quit();
    }
}
