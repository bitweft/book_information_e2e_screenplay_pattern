package book_information.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static book_information.user_interface.BookSearch.BOOK_SEARCH_BOX;
import static book_information.user_interface.BookSearch.SEARCH;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchBook implements Task {
    private final String bookName;

    public SearchBook(String bookName) {
        this.bookName = bookName;
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(bookName).into(BOOK_SEARCH_BOX));
        actor.attemptsTo(Click.on(SEARCH));
    }

    public static SearchBook called(String bookName) {
        return instrumented(SearchBook.class, bookName);
    }
}
