package org.deeksha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("deeksha");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahulacademy");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        System.out.println(driver.findElement(By.cssSelector("p[class='error']")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("deeksha");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("deeksha@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("1234567789");
        driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
        System.out.println(driver.findElement(By.cssSelector("p[class='infoMsg']")).getText());
        driver.findElement(By.xpath("//div/button[@class='go-to-login-btn']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("inputUsername")).sendKeys("deeksha");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("input[id='chkboxOne']")).click();
       //driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.cssSelector("button[class*=\"submit\"]")).click();
       Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");





        }
    }
