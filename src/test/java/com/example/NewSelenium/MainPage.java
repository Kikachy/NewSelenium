package com.example.NewSelenium;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    //public SelenideElement seeAllToolsButton = $ ( "a.wt-button_mode_primary" );
    //public SelenideElement toolsMenu = $x ( "//div[contains(@class, 'menu-main__item') and text() = 'Tools']" );
    public SelenideElement confirmButton = $ ( "#zV9nZe" );
    public SelenideElement searchButton = $ ( "input[name=btnK]" );
    public SelenideElement searchInput = $ ( "input[name=q]" );
}
