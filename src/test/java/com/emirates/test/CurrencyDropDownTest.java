package com.emirates.test;

import com.emirates.base.BaseTest;
import com.emirates.pages.Header;
import com.emirates.utils.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class CurrencyDropDownTest extends BaseTest {
    @Test
    public void testCurrencyDropDown(){
        Header header=homePage.getHeader();
        int beforePrices = homePage.getProductPrice();
        System.out.println("Before change :"+beforePrices);
        header.setCurrency("CAD");
        int afterPrices = homePage.waitForPriceChange(beforePrices);
        System.out.println("After change :"+afterPrices);
        int result=Utils.calculateCurrency("USD","CAD",beforePrices);
        Assert.assertEquals(afterPrices, result);
    }
}
