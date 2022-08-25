package co.com.instagram.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class Login implements Task {

    private final Map<String, String> mapLogin;

    public static Login logeo(Map<String, String> mapLogin){
        return instrumented(Login.class, mapLogin);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
