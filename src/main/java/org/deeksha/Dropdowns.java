package org.deeksha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement staticDropDown = driver.findElement(By.cssSelector("select[id='ctl00_mainContent_DropDownListCurrency']"));

        Select dropdown = new Select(staticDropDown);

        dropdown.selectByIndex(2);
        System.out.println(dropdown.getFirstSelectedOption().getText());

        driver.findElement(By.cssSelector("div[id='divpaxinfo']")).click();
        Thread.sleep(1000);
        for(int i=1;i<=4;i++) {


            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
       String str= driver.findElement(By.id("divpaxinfo")).getText();
       String res[]= str.split(" ");
        System.out.println("Number of passengers are "+res[0]);









    }
}
