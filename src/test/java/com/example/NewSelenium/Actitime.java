package com.example.NewSelenium;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class Actitime {
    public SelenideElement tryFreeButton = $ ( "[href='/free-online-trial']" );
    public SelenideElement firstNameInput = $ ( "#first-name" );
    public SelenideElement lastNameInput = $ ( "#last-name" );
    public SelenideElement emailInput = $ ( "#email" );
    public SelenideElement companyInput = $ ( "#company" );
}
