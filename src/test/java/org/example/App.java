package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua/");
        driver.findElement(By.name("search")).sendKeys("Iphone 15");
        driver.findElement(By.className("search-form__submit")).click();
        try {
            Thread.sleep(10000); // Задержка в 10 секунд
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();

    }
}
