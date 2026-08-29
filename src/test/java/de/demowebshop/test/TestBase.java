package de.demowebshop.test;

import core.ApplicationManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestBase {

   protected ApplicationManager app;
    @BeforeMethod
    public void setUp(){
        app = new ApplicationManager();
        app.init();
    }


    @AfterMethod
    public void tearDown(){
        app.stop();
        }
    }









/*
fillRegistrationForm("John", "Dow", newEmail(),
        "johndowtest1", "johndowtest1", "gender-male");

        public String newEmail(){
    int i = (int) ((System.currentTimeMillis()/1000)%3600);
    return "john" + i +"@dow.test";
}
public void type(By locator, String text){
   click(locator);
   driver.findElement(locator).clear();
   driver.findElement(locator).sendKeys(text);
}
public void click(By locator){
    driver.findElement(locator).click();
}
//    public void fillRegistrationForm(String firstName, String lastName, String email,
//                                     String password, String confirmPassword, String gender) {
//        click(By.id(gender));
//        type(By.id("FirstName"), firstName);
//        type(By.id("LastName"), lastName);
//        type(By.id("Email"), email);
//        type(By.id("Password"), password);
//        type(By.id("ConfirmPassword"), confirmPassword);
//    }
public void clickOnRegisterButton() {
    click(By.id("register-button"));
}
public void clickOnRegisterButton() {
    click(By.id("register-button"));
}
public boolean isLogOutPresent() {
    return isElementPresent(By.cssSelector("[href='/logout']"));
}
 */