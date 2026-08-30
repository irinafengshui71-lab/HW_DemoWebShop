package fw;

import core.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageHelper extends BaseHelper {
    public HomePageHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isHomePageOpened() {
        return isElementPresent(
                By.cssSelector("img[alt='Tricentis Demo Web Shop']"));
    }
}
