package ru.ya.test.widgets;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;



public class SearchedResultsPage {

    private final SelenideElement mainPage = $("body.b-page>div.main").waitUntil(Condition.visible,20000);

    public void assertResults(final String condition) {

        mainPage.$("ul[aria-label=\"Результаты поиска\"]");

    }
}