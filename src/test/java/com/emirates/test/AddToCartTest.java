package com.emirates.test;

import com.emirates.base.BaseTest;
import com.emirates.pages.ProductListPage;
import com.emirates.pages.ProductPage;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {
    @Test
    public void shouldSuccessfullyAddProductToCart()  {
        String product="Fossil Carraway Gents Watch";
        ProductListPage productListPage=homePage.goToCategory("Watches");
        ProductPage productPage=productListPage.selectProduct(product);
        productPage.validateProduct(product);
        productPage.addToBag();
    }
}
