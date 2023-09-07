package com.selenium.tests;

import com.google.common.annotations.VisibleForTesting;
import com.selenium.tests.base.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class UdemyTest {
    WebDriver driver;

    @Test
    public void test(){
        driver = new DriverFactory().initializeDriver();
        driver.get("https://www.zilverenkruis.nl/consumenten");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("cookiedrie"))).click();

        driver.findElement(By.xpath("//*[@placeholder='Zoeken']")).sendKeys("Premie");
        driver.findElement(By.xpath("//*[@class='coveo-search-button']")).click();
        driver.quit();
    }
}
