package co.com.instagram.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

import static co.com.instagram.userinterfaces.SearchInstagramHome.BTN_PUBLICATION;
import static co.com.instagram.userinterfaces.SearchInstagramHome.TXT_SEARCH;
import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor

public class SearchWord implements Task {

    private final Map<String,String> mapSearchWord;

    public static SearchWord inThePage(Map<String,String> mapSearchWord){
        return instrumented(SearchWord.class, mapSearchWord);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(mapSearchWord.get("Word")).into(TXT_SEARCH));
        actor.attemptsTo(Click.on(BTN_PUBLICATION));
    }
}
