package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flm6 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.name("firstname")).sendKeys("Avinash");
        driver.findElement(By.name("lastname")).sendKeys("Mule");
        new Select(driver.findElement(By.id("day"))).selectByVisibleText("29");
        new Select(driver.findElement(By.id("month"))).selectByVisibleText("Sep");
        new Select(driver.findElement(By.id("year"))).selectByVisibleText("2001");
        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.name("reg_email__")).sendKeys("6302706795");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Flmdec5@123");

    }
}