package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.util.List;

public class numberofPassengers {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);
        /*int i = 1;
        while (i<5){
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }*/
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        for(int i=1; i<5; i++){
            driver.findElement(By.id("hrefIncAdt")).click();

        }

        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        //dynamic dropdown
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        driver.findElement(By.xpath("//a[@value='HYD']")).click();

        //Parent-child relation xpath, below expression is equal to line 32 but it is of parent and child xpaths
        //driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']")).click();


        //Auto suugestive dropdowns
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(3000);
        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for(WebElement option : options){
            if(option.getText().equalsIgnoreCase("india")){
                option.click();
                break;
            }
        }
        //clicking check boxes
        driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
        //checking whether click box is selected or not
        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
        //checking no.of check boxes present
        //driver.findElement(By.cssSelector("input[type='checkbox']").size();
        //checking whether the calender is enabled or not
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
            System.out.println("it is enabled");
            Assert.assertTrue(true);
        }
        else{
            Assert.assertTrue(false);
        }




    }
}