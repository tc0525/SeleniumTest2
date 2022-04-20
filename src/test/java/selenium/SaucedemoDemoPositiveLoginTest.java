package selenium;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SaucedemoDemoPositiveLoginTest extends Base {

    @Test
    public void practiceTest() throws InterruptedException {


        driver.get("https://www.saucedemo.com/");
        Thread.sleep(3000);


        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        Thread.sleep(1000);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        Thread.sleep(1000);

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        Thread.sleep(1000);
        String titleActual = driver.getTitle();
        String titleExpected = "Swag Labs";


        Assert.assertEquals(titleActual, titleExpected);
        System.out.println("Заголовок страницы проверен");


        Assert.assertEquals(titleActual, titleExpected);
        System.out.println("Текст сообщения об ошибке проверен");


    }
}

