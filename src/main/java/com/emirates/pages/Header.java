package com.emirates.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Header {
    private WebDriver driver;
    private By currencyDropDown=By.cssSelector("button.ContextMenuTrigger_trigger__nAn3T");
    private WebDriverWait wait;
    public Header(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }
    public void setCurrency(String currency){
        driver.findElement(currencyDropDown).click();
        By currencyOption = By.xpath("//button[@value='" + currency + "']");
        wait.until(ExpectedConditions.elementToBeClickable(currencyOption)).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(currencyOption));
    }
}
