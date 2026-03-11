package org.deeksha;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Actions a = new Actions(driver);
        Thread.sleep(1000);
        a.moveToElement(driver.findElement(By.cssSelector("div[id='nav-link-accountList'] a:nth-child(1)"))).build().perform();
        a.moveToElement(driver.findElement(By.cssSelector("input[id ='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
        a.moveToElement(driver.findElement(By.cssSelector("input[id ='twotabsearchtextbox']"))).contextClick().build().perform();



    }
}
