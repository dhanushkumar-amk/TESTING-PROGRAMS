package Seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAHtmlFile {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("C:\\Users\\hp5cd\\Documents\\SeleniumTesting\\src\\Seleniumtest\\Registration.html");

        // name field validation
        WebElement userNameField = driver.findElement(By.id("username"));

        if (userNameField.isDisplayed() && userNameField.isEnabled())
            System.out.println("User name field is visible and enabled ");
        else
            System.out.println("User name field is nt visible");


        // email field validation
        WebElement userEmailField = driver.findElement(By.id("email"));

        if (userEmailField.isDisplayed() && userEmailField.isEnabled())
            System.out.println("User email field is visible and enabled ");
        else
            System.out.println("User email field is nt visible");


        // password field validation
        WebElement userPasswordField = driver.findElement(By.id("username"));

        if (userPasswordField.isDisplayed() && userPasswordField.isEnabled())
            System.out.println("User password field is visible and enabled ");
        else
            System.out.println("User password field is nt visible");


        // close the browser
//        driver.close();
    }


}
