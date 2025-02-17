package com.emirates.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductListPage {
    private WebDriver driver;
    public ProductListPage(WebDriver driver) {
        this.driver = driver;
    }
    public ProductPage selectProduct(String productName){
        driver.findElement(By.xpath("//p[text()='"+productName+"']")).click();
        return new ProductPage(driver);
    }
}
