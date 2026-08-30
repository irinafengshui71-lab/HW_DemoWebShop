package de.demowebshop.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

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
                        By.cssSelector("input[value='Continue']")));
        app.getUser().logout();

    }
    }


