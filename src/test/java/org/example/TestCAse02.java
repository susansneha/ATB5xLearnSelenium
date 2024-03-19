package org.example;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestCAse02 {
    @Test
    @Description("Verify title of TheTestingAcademy")
    public void vwoLogin(){
        WebDriver driver=new EdgeDriver();
        driver.get("https://thetestingacademy.com");
        System.out.println(driver.getTitle());
    }
}
