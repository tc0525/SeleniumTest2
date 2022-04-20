package selenium;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lesson13 extends Base {

    @Test
    public void practiceTest() throws InterruptedException {


        driver.get("https://www.saucedemo.com/");
        Thread.sleep(3000);

        String titleActual = driver.getTitle();
        String titleExpected = "Swag Labs";

        Assert.assertEquals(titleActual, titleExpected);
        System.out.println("Заголовок страницы проверен");

        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("test@test.com");
        Thread.sleep(1000);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("pass123");
        Thread.sleep(1000);

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        Thread.sleep(1000);

        WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));

        String actualTextMessage = errorMessage.getText();

        String expectedMessage = "Epic sadface: Username and password do not" +
                " match any user in this service";

        Assert.assertEquals(actualTextMessage, expectedMessage);
        System.out.println("Текст сообщения об ошибке проверен");


    }
}

