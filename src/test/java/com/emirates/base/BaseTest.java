package com.emirates.base;

import com.emirates.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeSuite
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://www.emiratesred.com/en-GB");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        homePage = new HomePage(driver);
        homePage.closeCookie();
    }
    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}
