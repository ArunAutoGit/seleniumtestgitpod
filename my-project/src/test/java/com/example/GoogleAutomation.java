package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;


public class GoogleAutomation {
    public static void main(String[] args) throws InterruptedException {
        
        // below line is used to setup chromedriver using WDM
        WebDriverManager.chromedriver().setup();

        //initialize the driver object
        WebDriver driver = new ChromeDriver();
        
        // Navigate to the demoqa website
        driver.get("https://www.lambdatest.com/selenium-playground/checkbox-demo");
        Thread.sleep(3000);
        
        driver.quit();

    }}