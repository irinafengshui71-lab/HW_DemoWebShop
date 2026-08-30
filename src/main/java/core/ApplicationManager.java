package core;
import fw.HomePageHelper;
import fw.ItemHelper;
import fw.UserHelper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ApplicationManager {
    private WebDriver driver;
    private UserHelper user;
    private ItemHelper item;
    private HomePageHelper home;


    public void init() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demowebshop.tricentis.com");

        user = new UserHelper(driver);
        item = new ItemHelper(driver);
        home = new HomePageHelper(driver);
    }
    public void stop() {

        if (driver != null) {
            driver.quit();
        }
    }

    public UserHelper getUser() {
        return user;
    }

    public ItemHelper getItem() {
        return item;
    }
    public HomePageHelper getHome() {
        return home;
    }

}
