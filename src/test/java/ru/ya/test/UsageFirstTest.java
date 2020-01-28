package ru.ya.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.ya.test.widgets.MainSearchingPage;
import ru.ya.test.widgets.SearchedResultsPage;

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
