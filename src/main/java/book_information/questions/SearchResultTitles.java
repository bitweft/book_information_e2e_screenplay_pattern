package book_information.questions;

import book_information.user_interface.SearchResult;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class SearchResultTitles implements Question<List<String>> {

    @Override
    public List<String> answeredBy(Actor actor) {
        return Text.of(SearchResult.TITLE)
                .viewedBy(actor)
                .asList();
    }
}
