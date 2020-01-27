package ru.yandex.test.widgets;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;


public class MainSearchingPage {
    private SelenideElement mainPage = $("body.b-page").waitUntil(Condition.visible,20000);

    public MainSearchingPage inputRequest(final String request) {
        $("input#text").setValue(request);
        return this;
    }

    public SearchedResultsPage findRequest(){
        mainPage.$("div.search2__button>button").click();
        return new SearchedResultsPage();
    }

}
