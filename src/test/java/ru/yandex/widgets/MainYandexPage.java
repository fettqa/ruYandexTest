package ru.yandex.widgets;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.util.Date;

import static com.codeborne.selenide.Selenide.$;

public class MainYandexPage {
    private final SelenideElement mainYandexPage = $("body.b-page").waitUntil(Condition.visible,20000);
    private String dateNow;
    private String dateFromPage;


    public MainYandexPage checkNewsBlock(){
        mainYandexPage.$("#wd-wrapper-_topnews");
        return this;
    }

    public MainYandexPage checkWeatherBlock(){
        mainYandexPage.$("#wd-wrapper-_weather");
        return this;
    }

    public void checkDateTime(){

        dateFromPage = mainYandexPage.$("span.datetime[data-bem]").getAttribute("data-bem");
        dateNow = new Date().toString();
        System.out.println(dateFromPage);
        System.out.println(dateNow);


    }

}
