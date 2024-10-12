package Seleniumtest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WriteAtestCaseBasedOnControls {
    WebDriver driver;
    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
    }
    @Test
    public void testTextInput()
    {
        driver.findElement(By.linkText("Inputs")).click();
        WebElement textField = driver.findElement(By.tagName("input"));
        textField.sendKeys("123456");
        String value = textField.getAttribute("value");
        assertEquals("123456",value );
    }
    @Test
    public void testcheckbox()
    {
        driver.findElement(By.linkText("Checkboxes")).click();
        WebElement Checkbox=driver.findElement(By.xpath("//Input[@type='checkbox'][1]"));
        if (!Checkbox.isSelected())
        {
            Checkbox.click();
        }
        assertTrue(Checkbox.isSelected());
    }

}
