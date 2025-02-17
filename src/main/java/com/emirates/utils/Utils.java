package com.emirates.utils;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.text.DecimalFormat;
import java.util.ArrayList;

import static io.restassured.RestAssured.*;

public class Utils {
    private static float convertCurrency(String currency1, String currency2){
        float apiResponse=given().queryParam("apikey","sgiPfh4j3aXFR3l2CnjWqdKQzxpqGn9pX5b3CUsz")
                .queryParam("base_currency",currency1)
                .queryParam("currencies",currency2).when().get("https://api.freecurrencyapi.com/v1/latest")
                .then().statusCode(200).extract()
                .path("data."+currency2);;
        System.out.println("Currency value in "+currency2+" is "+apiResponse);
        String formattedValue = Float.toString(apiResponse).substring(0,5);
        System.out.println("Currency value in "+currency2+" is "+formattedValue);
        float apiResult= Float.parseFloat(formattedValue);
        return apiResult;
    }
    public static int calculateCurrency(String currency1, String currency2, int prices){
       float currency=convertCurrency(currency1,currency2);
       String value=String.valueOf(prices*currency).split("\\.")[0];
       System.out.println(value);
       return Integer.parseInt(value);
    }

}
