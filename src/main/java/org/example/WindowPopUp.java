package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUp {
    public static void main (String[] args){
        WebDriver driver = new ChromeDriver();
        //window popups are not controlled by alerts so we are using different method
        //http://Username:Password@SiteUrl -- this will work with window popups
        //driver.get("https://the-internet.herokuapp.com/");
        driver.get("http://admin:admin@the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Basic Auth")).click();
    }
}
