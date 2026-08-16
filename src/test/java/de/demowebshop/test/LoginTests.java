package de.demowebshop.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
    @Test
    public void loginRegisteredUserPositiveTest(){
        register(By.cssSelector(".ico-login"));
        email();
        password();
        log_in_click();
        Assert.assertTrue(isElementPresent(By.cssSelector(".ico-logout")));// geters dobawitj

    }
    @Test
    public void loginWithWrongPasswordTest(){
        register(By.cssSelector(".ico-login"));
        driver.findElement(By.cssSelector("#Email")).sendKeys("irinafengshui71@gmail.com");
        driver.findElement(By.cssSelector("#Password")).sendKeys("WrongPassword123!");
        log_in_click();
        WebElement errorMessage = driver.findElement(By.cssSelector("div[class='validation-summary-errors'] span"));
        assert  errorMessage.isDisplayed(): "Login was unsuccessful. Please correct the errors and try again.";
    }
    @Test
    public void loginWithWrongEmailTest(){
        register(By.cssSelector(".ico-login"));
        driver.findElement(By.cssSelector("#Email")).sendKeys("Wrongemail@email.com");
        driver.findElement(By.cssSelector("#Password")).sendKeys("Aa123456!");
        log_in_click();

        WebElement errorMessage = driver.findElement(By.cssSelector("div[class='validation-summary-errors'] span"));
        assert  errorMessage.isDisplayed(): "Login was unsuccessful. Please correct the errors and try again.";
    }

    public void log_in_click() {
        driver.findElement(By.cssSelector("input[value='Log in']")).click();
    }

    public void password() {
        driver.findElement(By.cssSelector("#Password")).click();
        driver.findElement(By.cssSelector("#Password")).clear();
        driver.findElement(By.cssSelector("#Password")).sendKeys("Aa123456!");
    }

    public void email() {
        driver.findElement(By.cssSelector("#Email")).click();
        driver.findElement(By.cssSelector("#Email")).clear();
        driver.findElement(By.cssSelector("#Email")).sendKeys("irinafengshui71@gmail.com");
    }

}
