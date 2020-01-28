package ru.yandex.widgets;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.codeborne.selenide.Selenide.$;

public class MainYandexPage {
    private final SelenideElement mainYandexPage = $("body.b-page").waitUntil(Condition.visible,20000);
    private SimpleDateFormat dateFormat;
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
        Assert.assertTrue(compareWithCurrentDate(dateFromPage));
    }

    private boolean compareWithCurrentDate(final String dateFromPage){
        dateFormat = new SimpleDateFormat("MMMM dd, yyyy");
        dateNow = dateFormat.format(new Date());
        return dateFromPage.contains(dateNow);
    }

}
