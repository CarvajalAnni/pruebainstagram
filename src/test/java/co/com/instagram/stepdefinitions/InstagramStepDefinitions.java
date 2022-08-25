package co.com.instagram.stepdefinitions;

import co.com.instagram.tasks.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class InstagramStepDefinitions {



    @Given("that {string} enter the beginning of the instagram session {string}")
    public void thatEnterTheBeginningOfTheInstagramSession(String nameactor, String url) {
        setTheStage(new OnlineCast());
        theActorCalled(nameactor).wasAbleTo(Open.url(url));
    }

    @When("enter corresponding data")
    public void enterCorrespondingData(Map<String, String> mapLogin){
        theActorInTheSpotlight().attemptsTo(Login.logeo(mapLogin));
    }
    @Then("log in successfully")
    public void logInSuccessfully(){

    }

}
