package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    static String baseUrl = " https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //enter user name
        WebElement userName =driver.findElement(By.name("username"));
        userName.sendKeys("Admin");
        //enter password
       WebElement enterPassword = driver.findElement(By.name("password"));
       enterPassword.sendKeys("admin123");
        //click on login button
       WebElement clickOn = driver.findElement(By.xpath("//button[@type='submit']"));
       clickOn.click();
        //verify expected to actual by assert method
        String expectedText  = "Dashboard";
        WebElement actualTextElement = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText,actualText);

    }
    @After
    public void tearDown(){
       // driver.quit();
    }
}
