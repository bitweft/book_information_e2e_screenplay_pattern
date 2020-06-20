package book_information.questions;

import net.serenitybdd.screenplay.Question;

import java.util.List;

public class TheSearchResultTitles {
    public static Question<List<String>> displayed() {
        return new SearchResultTitles();
    }
}
