package pa.com.banistmo.certificacion.screenplayreto1.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/automationDemoSite.feature",
        tags = "@stories",
        glue = "pa.com.banistmo.certificacion.screenplayreto1.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags
{

}
