package de.demowebshop.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class CreateAccountTests extends TestBase{


    @Test
    public void newUserRegisterPositiveTest(String password){
        register(By.cssSelector(".ico-register"));
        
        firstname(By.xpath("(//input[@id='FirstName'])[1]"));
        lastname(By.xpath("//input[@id='LastName']"));
        newemail(By.xpath("//input[@id='Email']"), "irinafengshui741@gmail.com");

        newemail(By.cssSelector("#Password"), password);

        newemail(By.cssSelector("#ConfirmPassword"), password);

        register(By.cssSelector("#register-button"));

        Assert.assertTrue(isElementPresent(By.xpath(".ico-logout")));


    }

    @Test
    public void existedUserRegisterNegativeTest(){
        register(By.cssSelector(".ico-register"));
        
        firstname(By.xpath("(//input[@id='FirstName'])[1]"));
        lastname(By.xpath("//input[@id='LastName']"));

        newemail(By.xpath("//input[@id='Email']"), "irinafengshui71@gmail.com");

        newemail(By.cssSelector("#Password"), "Aa123456!");

        newemail(By.cssSelector("#ConfirmPassword"), "Aa123456!");

        register(By.cssSelector("#register-button"));
        WebElement errorNotification = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".validation-summary-errors")));
        Assert.assertTrue(errorNotification.isDisplayed());
        Assert.assertEquals(errorNotification.getText(), "The specified email already exists");


    }






}
