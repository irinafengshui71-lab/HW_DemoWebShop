package de.demowebshop.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ItemTests extends TestBase{

    @Test
    public void addItemToCartTest() {
            app.getUser().login(
                    "your-email@gmail.com",
                    "Aa123456!");

            String productName =
                    app.getItem().addSecondItemToCart();

            app.getItem().openShoppingCart();

        Assert.assertTrue(
                app.getItem().isItemInCart(productName),
                "Product was not added to cart: " + productName);


    }

}
