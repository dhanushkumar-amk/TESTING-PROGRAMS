package Seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class CountTheNumberOfObjectsPresentInTheWebpage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();

        WebDriver driver = new ChromeDriver(options);

        try
        {
            driver.get("https://www.wikipedia.org/");
            List<WebElement> allElements = driver.findElements(By.xpath("//*"));
            System.out.println("The number of item present in the webpage is : " + allElements.size());
        }
        finally {
//            System.out.println("success");success
        }
        driver.quit();

    }
}
