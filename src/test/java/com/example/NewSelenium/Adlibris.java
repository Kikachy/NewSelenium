package com.example.NewSelenium;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class Adlibris {
    public SelenideElement searchInput = $ ( "input[name=q]" );
    public SelenideElement searchResults = $ ( "#search-hits" );
    public SelenideElement HeaderButton = $ ( "[href='/se/checkouttransfer/transfer']" );
    public SelenideElement addToCart = $ ( "input()" );
}
