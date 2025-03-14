package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://jqueryui.com/droppable/");
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        //driver.switchTo().frame(0);  this can be used to find frames with the number
        // this frames is based on webelement
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        Actions a = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        a.dragAndDrop(source, target).build().perform();
        driver.switchTo().defaultContent();
    }
}