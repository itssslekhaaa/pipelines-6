package org.test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Main {
    @Test
    public void main() {
        WebDriver driver = new ChromeDriver();
        driver.get("https:/hianime.to/home");
        driver.manage().window().maximize();
    }
}