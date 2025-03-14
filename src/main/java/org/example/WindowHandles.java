package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.findElement(By.cssSelector(".blinkingText")).click();
        // here string windows stores multiple windows
        Set <String> windows = driver.getWindowHandles();  //parent and child
        // here iterator iterates through set of strings of windows
        Iterator <String> it = windows.iterator();
        // first iterator comes into parent window
        String parent = it.next();
        String child = it.next();
        driver.switchTo().window(child);
        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
        String emailid = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
        System.out.println(emailid);
        driver.switchTo().window(parent);
        driver.findElement(By.id("username")).sendKeys(emailid);



    }
}
