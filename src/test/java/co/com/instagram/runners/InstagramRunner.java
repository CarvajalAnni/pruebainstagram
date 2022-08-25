package co.com.instagram.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/instagram.feature",
        glue = "co/com/instagram/stepdefinitions"
)
public class InstagramRunner {
}
