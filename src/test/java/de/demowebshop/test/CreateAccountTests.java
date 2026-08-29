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
    public void newUserRegisterPositiveTest(){

        String email = "max" + System.currentTimeMillis() + "@gmail.com";

        String password = "Aa12345!";

        app.getUser().openRegistrationForm();

        app.getUser().fillRegistrationForm(
                "Max",
                "Musterman",
                email,
                password);

        app.getUser().clickRegisterButton();

        Assert.assertTrue(
                app.getUser().isElementPresent(
                        By.cssSelector("input[value='Continue']")
                )
        );

    }
    }


