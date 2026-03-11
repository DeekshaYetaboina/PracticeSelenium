package org.deeksha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class ChildWindows {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.cssSelector("a[href='https://rahulshettyacademy.com/documents-request']")).click();
        Set<String> w= driver.getWindowHandles();
        Iterator<String> it = w.iterator();
        String parentWindow = it.next();
        String childWindow = it.next();
        driver.switchTo().window(childWindow);
        String email =driver.findElement(By.cssSelector("[class='col-md-8'] p:nth-child(2)")).getText().split("at")[1].trim().split(" ")[0];
        driver.switchTo().window(parentWindow);
        driver.findElement(By.cssSelector("input[id='username']")).sendKeys(email);


    }
}
