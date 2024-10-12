package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAEmail {
    public static void main(String[] args) {
        System.setProperty("webdrver.chrome.driver", "c\\user\\documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        driver.close();
    }
}
