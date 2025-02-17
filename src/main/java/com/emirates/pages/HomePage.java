package com.emirates.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.ArrayList;
import java.util.List;

public class HomePage {
    private WebDriver driver;
    private  Header header;
    protected By productPrice = By.cssSelector("div.ProductTile_currentPrice__CMLRc");
    private By closeCookieButton= By.cssSelector("button.onetrust-close-btn-handler ");
    public HomePage(WebDriver driver) {
            this.driver=driver;
            this.header=new Header(driver);
        }
        public Header getHeader() {
            return this.header;
        }
        public ProductListPage goToCategory(String category){
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//p[text()='"+category+"']")));
        driver.findElement(By.xpath("//p[text()='"+category+"']")).click();
        return new ProductListPage(driver);
        }
        public ArrayList<Float> getProductPrices2(){
            ArrayList<Float> prices=new ArrayList<>();
            List<WebElement> pricesElement = driver.findElements(productPrice);
            for (WebElement priceElement: pricesElement){
                String formattedPrice=priceElement.getText().replaceAll("[$€£]", "").trim();
                System.out.println(formattedPrice);
                float price=Float.parseFloat(formattedPrice);
                prices.add(price);
            }
            return prices;
        }
    public ArrayList<Float> getProductPrices() {
        ArrayList<Float> prices = new ArrayList<>();
        List<WebElement> pricesElements = driver.findElements(productPrice);

        for (WebElement priceElement : pricesElements) {
            String formattedPrice = priceElement.getText().replaceAll("[$€£ABHDCK¥WMYROQSGFE]", "").trim();
            if (!formattedPrice.isEmpty()) {
                try {
                    float price = Float.parseFloat(formattedPrice);
                    prices.add(price);
                } catch (NumberFormatException e) {
                    System.out.println("Failed to parse price: " + formattedPrice);
                }
            }
        }
        return prices;
    }
    public void closeCookie(){
        driver.findElement(closeCookieButton).click();
    }
    public int getProductPrice(){
        String formattedPrice=driver.findElement(productPrice).getText().replaceAll("[$€£ABHDCK¥WMYROQSGFE]", "").trim().split("\\.")[0];
        return Integer.parseInt(formattedPrice);
    }
    }

