package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class InvokingWindows {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.switchTo().newWindow(WindowType.TAB);
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        String parent = it.next();
        String child = it.next();
        driver.switchTo().window(child);
        driver.get("https://courses.rahulshettyacademy.com/courses");
        String name = driver.findElements(By.className("course-listing-title")).get(1).getText();
        System.out.println(name);
        driver.switchTo().window(parent);
        WebElement avi = driver.findElement(By.name("name"));
        driver.findElement(By.name("name")).sendKeys(name);

        // get height and width
        System.out.println(avi.getRect().getDimension().getHeight());
        System.out.println(avi.getRect().getDimension().getWidth());


    }

}
//*[@id="courses-block"]/div[1]/div/div[2]/div[1]/h2/a