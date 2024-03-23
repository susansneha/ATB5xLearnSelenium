package org.example.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Selenium04 {
    @Test
    public void testMethod(){
        EdgeOptions edgeOptions=new EdgeOptions();
        //download addblock extension in my computer and copy the path here
       // edgeOptions.addExtensions(new File("/Users/pramod/Downloads/AdBlock1.crx"));
        WebDriver driver  = new EdgeDriver(edgeOptions);
        driver.get("https://youtube.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
