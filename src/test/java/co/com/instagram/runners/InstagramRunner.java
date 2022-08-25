package co.com.instagram.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/instragram.feature",
        glue = "co/com/instagram/stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class InstagramRunner {
}
