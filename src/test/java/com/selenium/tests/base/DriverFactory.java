package com.selenium.tests.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
    WebDriver driver;
    public WebDriver initializeDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headed", "--window-size=1920,1200");
        driver = new ChromeDriver(options);
        return driver;
    }
}
