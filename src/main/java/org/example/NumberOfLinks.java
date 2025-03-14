package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class NumberOfLinks {
    public static void main(String[] args){
        //working on all links in a page
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("no.of links " + allLinks.size());

        for (int i =0; i<allLinks.size(); i++){
            System.out.println(allLinks.get(i).getText());
            allLinks.get(i).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
            System.out.println(driver.getCurrentUrl());
            System.out.println("***********************");
            driver.navigate().back();
        }
        driver.quit();
    }
}
