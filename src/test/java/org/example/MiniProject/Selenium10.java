package org.example.MiniProject;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium10 {
    @Test(groups = "QA")
    @Description("Verify the current URl, title of VWO app")
    public void testVWOLogin() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        //print all anchor text in this website??
        List<WebElement> all_tags=driver.findElements(By.tagName("a"));
        all_tags.get(0).click();
        all_tags.get(1).click();
        all_tags.size();

        for (WebElement element:all_tags){
            System.out.println(element.getText());

                   }


        driver.close();

    }
}
