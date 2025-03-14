package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.name("name")).sendKeys("Avinash");
        driver.findElement(By.cssSelector(".form-control.ng-untouched.ng-pristine.ng-invalid")).sendKeys("avinash@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("Avi@123456");
        driver.findElement(By.id("exampleCheck1")).click();
        WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(0);
        driver.findElement(By.xpath("//label[text()='Employed']")).click();
        driver.findElement(By.name("bday")).sendKeys("17-07-2001");
        driver.findElement(By.cssSelector("input[value='Submit']")).click();
        System.out.println(driver.findElement(By.className("alert-success")).getText());

}}
