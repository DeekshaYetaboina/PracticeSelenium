package org.deeksha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VerifyFooterLinks {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        driver.get("https://www.iplt20.com/");
        driver.manage().window().maximize();
        WebElement footer = driver.findElement(By.xpath("//h2[text()='TEAM']"));
        actions.moveToElement(footer).perform();
        Thread.sleep(5000);
        List<WebElement> teamLinks =
                driver.findElements(By.xpath("//h2[text()='TEAM']/following-sibling::div//a"));

        List<String> actualTeams = new ArrayList<>();

        for(WebElement team : teamLinks){
            actualTeams.add(team.getText().trim());
        }

        List<String> expectedTeams = Arrays.asList(
                "Chennai super kings",
                "Delhi Capitals",
                "Gujarat Titans",
                "Kolkata Knight Riders",
                "Lucknow Super Giants",
                "Mumbai Indians",
                "Punjab Kings",
                "Rajasthan Royals",
                "Royal Challengers Bengaluru",
                "Sunrisers Hyderabad"
        );

        for(String team : expectedTeams){
            if(actualTeams.contains(team)){
                System.out.println(team + " present under TEAM section");
            }else{
                System.out.println(team + " missing under TEAM section");
            }
        }

        List<WebElement> aboutLinks =
                driver.findElements(By.xpath("//h2[text()='ABOUT']/following-sibling::div//a"));

        List<String> actualAbout = new ArrayList<>();

        for(WebElement link : aboutLinks){
            actualAbout.add(link.getText().trim());
        }

        List<String> expectedAbout = Arrays.asList(
                "About Us",
                "Anti Corruption Code",
                "Anti Doping Rules",
                "TUE Application Form",
                "Anti Discrimination Code",
                "Clothing and Equipment Regulations",
                "Code Of Conduct For Players and Teams Officials",
                "News Access Regulations",
                "Image Use Terms"
        );

        for(String about : expectedAbout){
            if(actualAbout.contains(about)){
                System.out.println(about + " present under ABOUT section");
            }else{
                System.out.println(about + " missing under ABOUT section");
            }
        }

        driver.quit();
    }
}





