package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class wsmTest {

    WebDriver driver;
    @BeforeTest
    void setup() {
        // Set up the wWebDriverManager for chrome driver
        WebDriverManager.chromedriver().setup();
        // Create the driver object
        driver = new ChromeDriver();
        // Open the browser and go to website

        driver.get("https://www.saudia.com/");
        driver.manage().window().maximize();
    }



    @Test
   public void choose_to_book_flight() throws InterruptedException {
        // Select from, to (Destination)
        driver.findElement(By.xpath("/html/body/app-root/app-layout/header/sc-placeholder/app-cookie-policy/div/div/div[2]/button/span[1]/div/span[2]")).click();
        driver.findElement(By.xpath("//input[@id='mat-input-1']")).click();
        driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[1]/mat-option[1]/span[1]/div[1]/div[1]/div[1]/b[1]")).click();
        driver.findElement(By.xpath("//input[@id='mat-input-2']")).click();
        //driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[1]/mat-option[1]/span[1]/div[1]/div[1]/div[1]/b[1]")).click();
        driver.findElement(By.xpath("//b[contains(text(),'أبوظبي, الامارات العربية المتحدة')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'البحث عن الرحلات')]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//tbody/tr[4]/td[1]/div[1]/button[1]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'تأكيد')]")).click();
    }

    @AfterTest
    void teardown() {
        // Close the driver
        driver.quit();
    }

}

