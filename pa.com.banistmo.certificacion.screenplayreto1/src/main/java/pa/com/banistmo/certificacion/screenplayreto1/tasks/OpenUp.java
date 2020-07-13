package pa.com.banistmo.certificacion.screenplayreto1.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import pa.com.banistmo.certificacion.screenplayreto1.userinterface.AutomationDemoSiteUserInterface;

public class OpenUp implements Task {
    private AutomationDemoSiteUserInterface automationDemoSiteUserInterface;
    public static Performable thePage(){

        return Tasks.instrumented(OpenUp.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(automationDemoSiteUserInterface));

    }
}
