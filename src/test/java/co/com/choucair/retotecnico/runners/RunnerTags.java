package co.com.choucair.retotecnico.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/createUser.feature",
                tags = "@stories",
                glue = "co.com-choucair.retotecnico.stepdefinitions",
                snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
