package book_information.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchResult {
    public static Target TITLE = Target.the("'search result title' field").located(By.id("title"));
}
