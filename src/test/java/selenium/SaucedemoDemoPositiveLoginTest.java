package selenium;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SaucedemoDemoPositiveLoginTest extends Base {

    @Test
    public void saucedemoDemoPositiveLoginTest() throws InterruptedException {

        openPage();

        login();


    }
}
