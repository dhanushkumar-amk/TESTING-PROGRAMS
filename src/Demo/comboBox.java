package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class comboBox {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "path");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://heroku.app");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement comboBox = driver.findElement(By.id("comboBox"));
        Select select = new Select(comboBox);

        List<WebElement> options = select.getOptions();
        int number = options.size();

        System.out.println(number);

    }
}
