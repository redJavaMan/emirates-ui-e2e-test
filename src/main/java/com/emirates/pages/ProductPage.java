package com.emirates.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
public class ProductPage {
    private WebDriver driver;
    private By productName= By.xpath("//h1[@itemprop='name']");
    private By addToBagButton= By.xpath("//button[@name='submitButton']");
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }
    public void validateProduct(String product) {
    Assert.assertEquals(driver.findElement(productName).getText(),product);
    }
    public void addToBag(){
        driver.findElement(addToBagButton).click();
    }
}
