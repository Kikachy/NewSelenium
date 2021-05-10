package com.example.NewSelenium;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class MainPageTest {
    MainPage mainPage = new MainPage ( );

    @BeforeAll
    public static void setUpAll () {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener ( "allure", new AllureSelenide ( ) );
    }

    @BeforeEach
    public void setUp () {
        open ("https://www.google.com/");
    }

    @Test
    public void search () {
        mainPage.confirmButton.click();
        mainPage.searchInput.sendKeys ( "Software Testing" );
        mainPage.searchButton.click ( );
    }
}
