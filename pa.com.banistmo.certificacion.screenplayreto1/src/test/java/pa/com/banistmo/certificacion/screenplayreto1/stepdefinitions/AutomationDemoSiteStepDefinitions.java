package pa.com.banistmo.certificacion.screenplayreto1.stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pa.com.banistmo.certificacion.screenplayreto1.model.RegistrationDemoSiteData;
import pa.com.banistmo.certificacion.screenplayreto1.questions.Answer;
import pa.com.banistmo.certificacion.screenplayreto1.tasks.OpenUp;
import pa.com.banistmo.certificacion.screenplayreto1.tasks.RegisterInformation;
import java.util.List;


public class AutomationDemoSiteStepDefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^that Claudia wants to access the Web Automation Demo Site$")
    public void thatClaudiaWantsToAccessTheWebAutomationDemoSite()  {
      OnStage.theActorCalled("Claudia").wasAbleTo(OpenUp.thePage());

    }

    @When("^she registers on the home page$")
    public void sheRegistersOnTheHomePage(List<RegistrationDemoSiteData> dataRegistration)  {
        OnStage.theActorCalled("Claudia").attemptsTo(RegisterInformation.OnThePage(dataRegistration.get(0)));

    }

    @Then("^she verifies that the screen load the text (.*)$")
    public void sheVerifiesThatTheScreenLoadTheText(String question)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
