package book_information;

import book_information.helpers.DriverHelper;
import book_information.questions.TheSearchResultTitles;
import book_information.tasks.SearchBook;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.CoreMatchers.*;

@RunWith(SerenityRunner.class)
public class SearchResultsTest {
    Actor maya = Actor.named("Maya");

    @Managed()
    public WebDriver webDriver;

    @Before
    public void setup() {
        webDriver = DriverHelper.getDriver();
        maya.can(BrowseTheWeb.with(webDriver));
    }

    @Test
    public void shouldBeAbleToSearchBook() {
        String searchTerm = "Harry";
        when(maya).attemptsTo(SearchBook.called(searchTerm));
        then(maya).should(seeThat(TheSearchResultTitles.displayed(), everyItem(containsString(searchTerm))));
    }
}
