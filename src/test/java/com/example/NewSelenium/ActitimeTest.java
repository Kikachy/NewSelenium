package com.example.NewSelenium;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class ActitimeTest {

    Actitime actitime  = new Actitime ();

        @BeforeAll
        public static void setUpAll () {
            Configuration.browserSize = "1290x797";
            SelenideLogger.addListener ( "allure", new AllureSelenide ( ) );
        }

        @BeforeEach
        public void setUp () {
            open ( "https://www.actitime.com/" );
        }

        @Test
        public void verifyTryFree () {
            //actitime.burgerMenu.click ();
            actitime.tryFreeButton.click();
            actitime.firstNameInput.sendKeys ( "Lidiya" );
            actitime.lastNameInput.sendKeys ( "Myroshnychenko" );
            actitime.emailInput.sendKeys ( "test@example.com" );
            actitime.companyInput.sendKeys ( "Företag" );
        }
    }
