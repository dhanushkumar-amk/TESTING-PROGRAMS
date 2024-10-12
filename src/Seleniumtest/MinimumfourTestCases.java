package Seleniumtest;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MinimumfourTestCases {

    private static  WebDriver driver;
    @BeforeClass
    public static void setUp()
    {
        // Set path for ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    // google email login
        @Test
    public void testValidBankLogin()
    {
        driver.get("https://mail.google.com");
        driver.findElement(By.id("identifierId")).sendKeys("Dhanushkumar@gmail.com");
        driver.findElement(By.xpath("//button[@type='button']")).click();
//        driver.findElement(By.id("loginButton")).click();

        WebElement GetTittle =    driver.findElement(By.id("headingText"));
        Assert.assertTrue(GetTittle.getText().contains("Find your email"));

    }


    // Test Case 2:Test a Google Webpage
    @Test
    public void testInvalidBankLogin()
    {
        driver.get("https://google.com");
        driver.findElement(By.id("APjFqb")).sendKeys("Go Language");
    }
    // Test Case 3: Product Search for Example E-Commerce
    @Test
    public void testProductSearch()
    {
        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15 pro");
        driver.findElement(By.id("nav-search-submit-button")).click();

        WebElement productTitle = driver.findElement(By.cssSelector(".a-section"));
        Assert.assertTrue(productTitle.getText().contains("iphone 15 pro"));
    }
    // Test Case 4: Add Product to Cart for Example E-Commerce
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