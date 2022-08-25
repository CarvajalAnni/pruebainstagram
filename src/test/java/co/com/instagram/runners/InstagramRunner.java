package co.com.instagram.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
<<<<<<< HEAD
        features = "src/test/resources/features/instagram.feature",
        glue = "co/com/instagram/stepdefinitions"
=======
        features = "src/test/resources/features/instragram.feature",
        glue = "co/com/instagram/stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
>>>>>>> 9ea028b864a49d34c48f1283812a296237ee0f2c
)
public class InstagramRunner {
}
