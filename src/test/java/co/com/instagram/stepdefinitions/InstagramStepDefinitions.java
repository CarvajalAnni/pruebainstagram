package co.com.instagram.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class InstagramStepDefinitions {

    @Before
    public void inicialice(){
        setTheStage(new OnlineCast());
    }

    @Given("enter the beginning of the instagram session {string}")
    public void enterTheBeginnigOfTheInstagramSession(String url){
        Actor luna = Actor.named("luna");
        theActorCalled(String.valueOf(luna)).wasAbleTo(Open.url(url));
    }

    @When("enter corresponding data")
    public void enterCorrespondingData(){

    }
    @Then("log in successfully")
    public void logInSuccessfully(){

    }

}
