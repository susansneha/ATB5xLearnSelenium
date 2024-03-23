package org.example.Selenium;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium07 {
  @Test
    public void testMethod(){
      EdgeDriver driver = new EdgeDriver();
      driver.get("https://bing.com"); //  // No back, forward allowed in case of get

      driver.navigate().to("https://app.vwo.com");
     // driver.navigate().to(new URL("https://google.com"));
      driver.navigate().back();
      driver.navigate().forward();
      driver.navigate().refresh();
  }
}
