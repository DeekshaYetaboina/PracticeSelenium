package org.deeksha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Deeksha");
        driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
        driver.switchTo().alert().accept();
        driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Deeksha");
        driver.findElement(By.cssSelector("input[id='confirmbtn']")).click();
        driver.switchTo().alert().dismiss();



    }
}
