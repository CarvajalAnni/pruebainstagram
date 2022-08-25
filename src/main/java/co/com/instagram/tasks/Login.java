package co.com.instagram.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

import static co.com.instagram.userinterfaces.InstagramHome.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class Login implements Task {

    private final Map<String, String> mapLogin;

    public Login(Map<String, String> mapLogin) {
        this.mapLogin = mapLogin;
    }

    public static Login logeo(Map<String, String> mapLogin){
        return instrumented(Login.class, mapLogin);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(mapLogin.get("username")).into(USERNAME));
        actor.attemptsTo(Enter.theValue(mapLogin.get("password")).into(PASSWORD));
        actor.attemptsTo(Click.on(BTN_GETIN));
    }
}
