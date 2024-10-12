package demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program4 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("C:\\Users\\hp5cd\\Documents\\SeleniumTesting\\src\\Seleniumtest\\Registration.html");

        WebElement name = driver.findElement(By.id("username"));
        if (name.isEnabled() && name.isDisplayed())
            System.out.println("enabled");
        else
            System.out.println("not enabled");

    }
}
