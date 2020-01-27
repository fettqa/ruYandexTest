package ru.yandex.test.widgets;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$x;

public class MainSearchingPage {
    private SelenideElement mainPage = $x("/html/body").waitUntil(Condition.visible,20000);

    public MainSearchingPage inputRequest(final String request) {
        mainPage.$(By.id("text")).setValue(request);
        return this;
    }

    public void findRequest(){
        mainPage.$("div.search2__button>button").click();
    }

}
