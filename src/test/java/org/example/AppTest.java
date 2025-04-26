package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AppTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void searchIphoneOnRozetka() {
        driver.get("https://rozetka.com.ua/");
        driver.findElement(By.name("search")).sendKeys("Iphone 15");
        driver.findElement(By.cssSelector("button.search-form__submit")).click();

        // Здесь можно добавить ожидание элемента, чтобы удостовериться, что результаты появились
        // Например:
        // new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".goods-tile__title")));
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
