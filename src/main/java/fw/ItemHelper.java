package fw;

import core.BaseHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;

public class ItemHelper extends BaseHelper {
    public ItemHelper(WebDriver driver) {
        super(driver);
    }
    public String addSecondItemToCart() {

        List<WebElement> products =
                driver.findElements(By.cssSelector(".product-item"));

        WebElement secondProduct = products.get(1);

        String productName =
                secondProduct.findElement(
                        By.cssSelector(".product-title")
                ).getText();

        secondProduct.findElement(
                By.cssSelector("input[value='Add to cart']")
        ).click();

        return productName;
    }

    public void openShoppingCart() {
        click(By.cssSelector(".ico-cart"));
    }

    public boolean isItemInCart(String productName) {
        return driver.findElements
                (By.xpath("//td[@class='product']//a[contains(text(),'"
                                + productName + "')]")).size() > 0;
    }


}


