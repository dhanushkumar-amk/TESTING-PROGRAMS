package Seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckEachFieldOfTheRegiistrationForm {
    public static void main(String[] args)
    {
        // Path to your HTML file
        String htmlFilePath = "C:\\Users\\hp5cd\\Documents\\SeleniumTesting\\src\\Seleniumtest\\index.html";
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try
        {
            driver.get(htmlFilePath);
            WebElement usernameInput = driver.findElement(By.id("username"));
            usernameInput.sendKeys("testuser");
            WebElement passwordInput = driver.findElement(By.id("password"));
            passwordInput.sendKeys("password123");
            WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
            submitButton.click();
            System.out.println("Test passed successfully!");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
