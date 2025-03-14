package org.example;
import org.openqa.selenium.Keys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class IteratingThroughWindowHandles {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qaclickacademy.com/practice.php");
        //we are getting no.of links in page
        System.out.println(driver.findElements(By.tagName("a")).size());
        // we are getting no.of links in footer by limiting driver
        WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
        System.out.println(footerdriver.findElements(By.tagName("a")).size());
        // we are getting no.of links in one column of footer by limiting driver
        WebElement columndriver = driver.findElement(By.xpath("//table/tbody/tr/td/ul"));
        System.out.println(columndriver.findElements(By.tagName("a")).size());
        //4- click on each link in the coloumn and check if the pages are opening-
        for(int i =0; i< columndriver.findElements(By.tagName("a")).size(); i++){
            // Normally in this website pages are opening on diff windows so by below keys we can open them in a single window on diff tabs
            String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
            columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
            Thread.sleep(5000);
        }
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();

        while (it.hasNext()){
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }









    }

}
