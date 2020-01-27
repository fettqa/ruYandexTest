package ru.yandex;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.yandex.widgets.MainYandexPage;

public class UsageSecondTest {
    private final MainYandexPage mainYandexPage = new MainYandexPage();
    private final String request = "Основы автоматизации тестирования";
    private final String condition = "Результаты поиска";

    @BeforeClass
    public static void setUp(){
        Configuration.browser = "firefox";
        Selenide.open("https://yandex.ru");
    }

    @Test

    public void secondTest() {
        mainYandexPage.
                checkNewsBlock().
                checkWeatherBlock().
                checkDateTime();
    }


}
