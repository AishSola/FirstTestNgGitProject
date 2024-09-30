package org.example;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;
import org.openqa.selenium.*;

public class LoginPage {
    ChromeDriver driver;

    @BeforeTest
    public void OpenChrome()
    {
        driver= new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }
    @Test
    public void Login() {
       driver.findElement(By.id("user-name")).sendKeys("Aish");
       driver.findElement(By.id("password")).sendKeys("asder");
       driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
    }
    @AfterTest
    public void cleanup()
    {
        if(driver == null)
        {
          driver.quit();
        }
    }
}
