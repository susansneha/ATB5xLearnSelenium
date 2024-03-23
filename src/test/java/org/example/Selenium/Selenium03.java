package org.example.Selenium;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Selenium03 {
    @Test
    public void testMethod(){
        SearchContext driver=new ChromeDriver();
        WebDriver driver1 = new ChromeDriver();
        RemoteWebDriver driver2= new ChromeDriver();

        //EdgeDriver driver3= new EdgeDriver();
        WebDriver driver4=new EdgeDriver();
        driver4=new EdgeDriver();

    }
}
