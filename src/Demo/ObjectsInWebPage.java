package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class ObjectsInWebPage {
    public static void main(String[] args) {

        System.setProperty("Chrome", "path");

        ChromeOptions options = new ChromeOptions();

        WebDriver driver = new ChromeDriver(options);

        try{
            driver.get("https://wikipedia.com");
            List<WebElement> allElements = driver.findElements(By.xpath("//*"));
            System.out.println(allElements.size());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
