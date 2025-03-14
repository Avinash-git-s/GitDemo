package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AssignmentWindows {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");
        driver.findElement(By.xpath("//a[text() = 'Multiple Windows']")).click();
        driver.findElement(By.xpath("//a[text() = 'Click Here']")).click();
        Set <String> avi = driver.getWindowHandles();
        Iterator <String> it = avi.iterator();
        String parent = it.next();
        String child = it.next();
        System.out.println(driver.findElement(By.className("example")).getText());
        driver.switchTo().window(parent);
        System.out.println(driver.findElement(By.className("example")).getText());



    }
}
