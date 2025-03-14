package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class NumberOfLinksInBottom {
    public static void main(String[] args) throws InterruptedException{
        //working on all links in a page
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
       WebElement block = driver.findElement(By.xpath("//div[text()='Connect with Us']/parent::div"));
        List <WebElement> allLinks = block.findElements(By.tagName("a"));
        System.out.println("no.of links "+ allLinks.size());

        for(int i =0; i<allLinks.size(); i++){
           // block = driver.findElement(By.xpath("//div[text()='Connect with Us']/parent::div"));

           // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
            System.out.println(allLinks.get(i).getText());
            allLinks.get(i).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
            System.out.println(driver.getCurrentUrl());
            System.out.println("***********************");
            //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
            driver.navigate().back();

        }
        driver.quit();
    }
}
