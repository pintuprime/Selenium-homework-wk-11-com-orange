package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
/*
Project-2 - ProjectName : com-orangehrmlive-sw-2
BaseUrl = https://opensource-demo.orangehrmlive.com/
1. Create the package ‘browserfactory’ and create the
class with the name ‘BaseTest’ inside the
‘browserfactory’ package. And write the browser setup
code inside the class ‘Base Test’.
2. Create the package ‘testsuite’ and create the
following classes inside the ‘testsuite’ package.
1. LoginTest
2. ForgotPasswordTest
3. Write down the following test into ‘LoginTest’ class
1. userSholdLoginSuccessfullyWithValidCredentials
* Enter “Admin” username
* Enter “admin123 password
* Click on ‘LOGIN’ button
* Verify the ‘Dashboard’ text is display
4. Write down the following test into
‘ForgotPasswordTest’ class
1. userShouldNavigateToForgotPasswordPageSuccessfull
y
* click on the ‘Forgot your password’ link
* Verify the text ‘Reset Password’
 */

public class ForgotPasswordTest extends BaseTest {

    static String baseUrl = " https://opensource-demo.orangehrmlive.com/";

    @Before
    public void openBrowser() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        //click on forget password
        WebElement forgetPassword =driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
        forgetPassword.click();
        //verify expected with actual with assert method
        String expectedText = "Reset Password";
        WebElement actualTextElement = driver.findElement(By.xpath("//h6[text()='Reset Password']"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText,actualText);

    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
