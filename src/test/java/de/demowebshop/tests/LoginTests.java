package de.demowebshop.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    private final String EMAIL =
            "irinafengshui71@gmail.com";

    private final String PASSWORD =
            "Aa123456!";
    @Test
    public void loginRegisteredUserPositiveTest(){
        app.getUser().login(
                EMAIL, PASSWORD);

        Assert.assertTrue(
                app.getUser().isElementPresent(
                        By.cssSelector(".ico-logout")));
    }

    @Test
    public void loginWithWrongPasswordTest() {
        app.getUser().openLoginForm();
        app.getUser().fillLoginForm(EMAIL, "WrongPassword123!");
        app.getUser().clickLoginButton();
    }


        @Test
        public void loginWithWrongEmailTest () {
            app.getUser().openLoginForm();

            app.getUser().login(
                    "Wrongemail@email.com",
                    PASSWORD);
            Assert.assertTrue(
                    app.getUser().isElementPresent(
                            By.cssSelector(
                                    "div[class='validation-summary-errors'] span")));
        }
    }










