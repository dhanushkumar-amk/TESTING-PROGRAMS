package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registrartionpage {
    public static void main(String[] args) {

        String htmlPath = "";
        System.setProperty("webdriver.chrome.driver", "chromedriver path");
        WebDriver driver = new ChromeDriver();


        try{
            driver.get(htmlPath);

            WebElement userInput = driver.findElement(By.id("username"));
            userInput.sendKeys("hello");

            WebElement emailInput =  driver.findElement(By.id("email"));
            emailInput.sendKeys("email");

            WebElement submitButton = driver.findElement(By.xpath("\\button[@type='submit']"));
            submitButton.click();

            System.out.println("text case passed");
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
