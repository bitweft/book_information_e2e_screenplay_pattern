package book_information.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BookSearch {
    public static Target BOOK_SEARCH_BOX = Target.the("'BookName' field").located(By.id("book_name"));
    public static Target SEARCH = Target.the("'SEARCH' button").located(By.id("search_books"));
}
