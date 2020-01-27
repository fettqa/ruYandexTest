package ru.ya.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.ya.test.widgets.MainSearchingPage;
import ru.ya.test.widgets.SearchedResultsPage;

/* Сценарий 1:
         •       Для сайта https://ya.ru/ создать следующие сценарии:
         •       Открыть страницу https://ya.ru/
         •       Ввести в строку поиска текст "Основы автоматизации тестирования"
         •       Нажать кнопку "Найти"
         •       Проверить, что вернулись результаты поиска

         Сценарий 2:
         •       Открыть страницу https://yandex.ru/
         •       Проверить, что на загруженной странице отображается блок с новостями и блок с погодой
         •       Проверить, что дата на загруженной странице соответствует текущей */

public class UsageFirstTest {
    private final MainSearchingPage mainSearchingPage = new MainSearchingPage();
    private final String request = "Основы автоматизации тестирования";
    private final String condition = "Результаты поиска";

    @BeforeClass
    public static void setUp(){
        Configuration.browser = "firefox";
        Selenide.open("https://ya.ru");
    }

    @Test
    public void firstTest() {
        mainSearchingPage.inputRequest(request);
        SearchedResultsPage searchedResultsPage = mainSearchingPage.findRequest();
        searchedResultsPage.assertResults(condition);
    }
}
