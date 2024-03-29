package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class SecondTest {
    @Test
    public void firstTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:/Automated Testing/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        driver.get("https://selectorshub.com/xpath-practice-page/");
        Thread.sleep(3000);

        String titleActual = driver.getTitle();
        String titleExpected = "XPath & cssSelector Practice Page with all scenarios";


        WebElement userEmail = driver.findElement(By.id("userId"));
        userEmail.sendKeys("test@test.com");

        Thread.sleep(3000);

        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("pass123");

        Thread.sleep(3000);

        WebElement company = driver.findElement(By.name("company"));
        company.sendKeys("qa company");

        Thread.sleep(3000);

        WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
        submit.click();

        Thread.sleep(3000);

        driver.quit();

    }
}
