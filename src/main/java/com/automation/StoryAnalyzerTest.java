package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StoryAnalyzerTest {
    
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        driver.get("file:///C:/selenium-StoryRater/story-test-rater/story_rater.html");
        System.out.println("Opened Story Age-Rater Tool");

        WebElement storyBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("story-input")));
        WebElement analyzeBtn = driver.findElement(By.id("analyze-btn"));

        storyBox.sendKeys("A tiny seed grew fast");
        System.out.println("Entered toddler story text");

        Thread.sleep(2000);
        analyzeBtn.click();
        
        Thread.sleep(2000);
        WebElement resultElement = driver.findElement(By.id("age-rating-result"));
        
        if (resultElement.getText().contains("Ages 4-6")) {
            System.out.println("Test 1 Passed: Correctly identified as Ages 4-6!");
        } else {
            System.out.println("Test 1 Failed!");
        }

        Thread.sleep(2000);
        storyBox.clear();
        storyBox.sendKeys("The automated software testing curriculum requires rigorous validation protocols.");
        System.out.println("Entered complex college text");

        Thread.sleep(2000);
        analyzeBtn.click();
        
        Thread.sleep(2000);
        if (resultElement.getText().contains("Too Complex")) {
            System.out.println("Test 2 Passed: Correctly identified as Too Complex!");
        } else {
            System.out.println("Test 2 Failed!");
        }

        Thread.sleep(2000);
        driver.quit();
    }
}