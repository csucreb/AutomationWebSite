package pa.com.banistmo.certificacion.screenplayreto1.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Upload;
import pa.com.banistmo.certificacion.screenplayreto1.model.RegistrationDemoSiteData;
import pa.com.banistmo.certificacion.screenplayreto1.userinterface.RegistrationInformationUserInterface;

import java.nio.file.Paths;


public class RegisterInformation implements Task {

    private RegistrationDemoSiteData registrationDemoSiteData;

    public RegisterInformation(RegistrationDemoSiteData registrationDemoSiteData) {
        this.registrationDemoSiteData = registrationDemoSiteData;
    }

    public static Performable OnThePage(RegistrationDemoSiteData registrationDemoSiteData) {
        return Tasks.instrumented(RegisterInformation.class,registrationDemoSiteData);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(registrationDemoSiteData.getFirstName()).into(RegistrationInformationUserInterface.INPUT_FIRST_NAME));

        actor.attemptsTo(Enter.theValue(registrationDemoSiteData.getLastName()).into(RegistrationInformationUserInterface.INPUT_LAST_NAME));

        actor.attemptsTo(Upload.theFile(Paths.get(registrationDemoSiteData.getFile()))
                .to(RegistrationInformationUserInterface.INPUT_FILE));

        actor.attemptsTo(Enter.theValue(registrationDemoSiteData.getAddress()).into(RegistrationInformationUserInterface.INPUT_ADDRESS));

        actor.attemptsTo(Enter.theValue(registrationDemoSiteData.getEmailAddress()).into(RegistrationInformationUserInterface.INPUT_EMAIL_ADDRESS));

        actor.attemptsTo(Enter.theValue(registrationDemoSiteData.getPhone()).into(RegistrationInformationUserInterface.INPUT_PHONE));

        actor.attemptsTo(Click.on(RegistrationInformationUserInterface.SELECT_GENDER.getCssOrXPathSelector()
            .replace("$gender",registrationDemoSiteData.getGender())));

        actor.attemptsTo(Click.on(RegistrationInformationUserInterface.SELECT_HOBBIE.getCssOrXPathSelector()
            .replace("$hobbies",registrationDemoSiteData.getHobby())));

        actor.attemptsTo(Click.on(RegistrationInformationUserInterface.CLICK_LANGUAGE));

        actor.attemptsTo(Click.on(RegistrationInformationUserInterface.SELECT_LANGUAGE.getCssOrXPathSelector()
            .replace("$language", registrationDemoSiteData.getLanguage())));

        actor.attemptsTo(SelectFromOptions.byVisibleText(registrationDemoSiteData.getSkill())
                .from(RegistrationInformationUserInterface.SELECT_SKILL));

        actor.attemptsTo(SelectFromOptions.byVisibleText(registrationDemoSiteData.getCountry())
                .from(RegistrationInformationUserInterface.SELECT_COUNTRY));

        actor.attemptsTo(Click.on(RegistrationInformationUserInterface.CLICK_SCOUNTRY));

        actor.attemptsTo(Click.on(RegistrationInformationUserInterface.SELECT_SCOUNTRY.getCssOrXPathSelector()
                .replace("$sCountry", registrationDemoSiteData.getsCountry())));

        actor.attemptsTo(SelectFromOptions.byVisibleText(registrationDemoSiteData.getBirthYear())
                .from(RegistrationInformationUserInterface.SELECT_BIRTH_YEAR));

        actor.attemptsTo(SelectFromOptions.byVisibleText(registrationDemoSiteData.getBirthMonth())
                .from(RegistrationInformationUserInterface.SELECT_BIRTH_MONTH));

        actor.attemptsTo(SelectFromOptions.byVisibleText(registrationDemoSiteData.getBirthDay())
                .from(RegistrationInformationUserInterface.SELECT_BIRTH_DAY));

        actor.attemptsTo(Enter.theValue(registrationDemoSiteData.getPassword()).into(RegistrationInformationUserInterface.INPUT_PASS));

        actor.attemptsTo(Enter.theValue(registrationDemoSiteData.getConfirmPassword()).into(RegistrationInformationUserInterface.INPUT_CONFIRM_PASS));

        actor.attemptsTo(Click.on(RegistrationInformationUserInterface.SUBMIT_BUTTON));




    }
}
