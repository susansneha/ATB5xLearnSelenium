package org.example.Selenium_Project_1;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Project_1 {
    @Test(groups = "QA")
    @Description("Verify the current URl, title of VWO app")
    public void testVWOLogin() {
        //  **Project #1 - TC ( Negaative) - Invalid username, pass - Error message**

        //       1. Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
//        2. **Find the Email id** and enter the email as admin@admin.com
//        3. **Find the pass inputbox** and enter passwrod as admin.
//        4. Find and Click on the submit button
//        5. Verify that the error message is shown "Your email, password, IP address or location did not match"
//

        WebDriver driver = new EdgeDriver();
        // 1. Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");
//
//        2. **Find the Email id** and enter the email as admin@admin.com
        WebElement emailInputBox= driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");

//        3. **Find the pass inputbox** and enter passwrod as admin.
        WebElement passwordInputBox = driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("admin");
        driver.findElement(By.id("js-login-btn")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        5. Verify that the error message is shown "Your email, password, IP address or location did not match"
        WebElement error_msg = driver.findElement(By.className("notification-box-description"));
        String error_msg_text  = error_msg.getText();

        String error_msg_attribute_dataqa  = error_msg.getAttribute("data-qa");
        System.out.println(error_msg_attribute_dataqa);


        Assert.assertEquals(error_msg_text,"Your email, password, IP address or location did not match");

        driver.quit();
    }
}
