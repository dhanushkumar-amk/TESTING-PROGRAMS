package Seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CountNumberOfListItemsAndComboBox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement comboBox = driver.findElement(By.id("dropdown"));
        Select select = new Select(comboBox);

        List<WebElement>options = select.getOptions();
        int numbersOfOptions = options.size();
        System.out.println("Number of items in the combo-box : " + numbersOfOptions);
        driver.quit();
    }
}
