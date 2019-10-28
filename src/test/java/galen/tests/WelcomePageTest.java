package galen.tests;

import galen.components.GalenTestBase;
import galen.components.TestDevice;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;


public class WelcomePageTest extends GalenTestBase {

    @Test(dataProvider = "devices")
    public void welcomePage_shouldLookGood_onDevice(TestDevice device) throws IOException {
        load("/");
        checkLayout("/specs/welcomePage.spec", device.getTags());
    }

    @Test(dataProvider = "devices")
    public void loginPage_shouldLookGood_onDevice(TestDevice device) throws IOException {
        load("/");
        getDriver().findElement(By.id("username")).clear();
        getDriver().findElement(By.id("username")).sendKeys("admin");
        getDriver().findElement(By.id("password")).sendKeys("admin");

        getDriver().findElement(By.xpath("//button[@type = 'submit']")).click();
        checkLayout("/specs/planning.spec", device.getTags());
    }

}
