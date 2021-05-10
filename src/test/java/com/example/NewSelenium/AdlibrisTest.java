package com.example.NewSelenium;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdlibrisTest {

    Adlibris adlibris  = new Adlibris ();
    WebDriver driver = new ChromeDriver (  );

    @BeforeAll
    public static void setUpAll () {
        Configuration.browserSize = "1290x797";
        SelenideLogger.addListener ( "allure", new AllureSelenide ( ) );
    }

    @BeforeEach
    public void setUp () {
        //open ( "https://www.adlibris.com/se" );
    }

    @Test
    public void search () throws InterruptedException {
        driver.get("https://www.adlibris.com/se");

        // "praktisk mjukvarutestning" with a ENTER
        WebElement searchInput = driver.findElement ( By.cssSelector ("input[name=q]" ) );
        searchInput.sendKeys ( "Praktisk mjukvarutestning" );
        searchInput.sendKeys ( Keys.ENTER );

        // Click on the project
        driver.findElement ( By.linkText ( "Praktisk mjukvarutestning" ) ).click ();

        // Click on add to cart
        driver.findElement ( By.cssSelector ( ".product__add-to-cart" ) ).click ();

        // Click on the shopping cart, in the top right
        WebElement cart = driver.findElement ( By.cssSelector ( ".page-header__toggler--cart" ) );
        cart.click();
        driver.wait (1000);

        // Click on Till kassan
        cart.findElement ( By.cssSelector ( ".cart__checkout" ) ).click ();
        cart.click();
        driver.wait (1000);

        // Close
        driver.wait(5000);
        driver.quit();
    }
}

