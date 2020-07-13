package pa.com.banistmo.certificacion.screenplayreto1.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrationInformationUserInterface extends PageObject {
    public static final Target INPUT_FIRST_NAME = Target.the("where we write the first name")
            .located(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']//input[@type ='text' and @placeholder='First Name']"));

    public static final Target INPUT_LAST_NAME = Target.the("where we write the last name")
            .located(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']//input[@type ='text' and @placeholder='Last Name']"));

    public static final Target INPUT_FILE =Target.the("button to choose the image")
            .located(By.xpath("//input[@id='imagesrc' and @type='file']"));

    public static final Target INPUT_ADDRESS = Target.the("where we write the address")
            .located(By.xpath("//textarea[@ng-model='Adress']"));

    public static final Target INPUT_EMAIL_ADDRESS = Target.the("where we write the email address")
            .located(By.xpath("//input[@type='email' and @ng-model='EmailAdress']"));

    public static final Target INPUT_PHONE = Target.the("where we write the phone number")
            .located(By.xpath("//input[@type='tel' and @ng-model='Phone']"));

    public static final Target SELECT_GENDER = Target.the("where we select the gender")
            .locatedBy("//input[@type='radio' and @name='radiooptions' and @value='$gender']");

    public static final Target SELECT_HOBBIE = Target.the("where we select the hobby")
            .locatedBy("//input[@type='checkbox' and @value='$hobbies']");

    public static final Target CLICK_LANGUAGE = Target.the("the click to deploy the language options")
            .located(By.xpath("//div[@id='msdd']"));

    public static final Target SELECT_LANGUAGE = Target.the("options to select the language")
            .locatedBy("//li[@list-select and @class='ng-scope']//child::a[contains(text(),'$language')]");

    public static final Target SELECT_SKILL = Target.the("options to select the skill")
            .located(By.xpath("//select[@id='Skills' and @type='text']"));

    public static final Target SELECT_COUNTRY = Target.the("options to select the country")
            .located(By.xpath("//select[@id='countries' and @type='text']"));

    public static final Target CLICK_SCOUNTRY = Target.the("click to deploy the second country")
            .located(By.xpath("//span[@class='select2-selection select2-selection--single' and @role = 'combobox']"));

    public static final Target SELECT_SCOUNTRY = Target.the("options to select the second country")
            .locatedBy("//ul[@id='select2-country-results']//child::li[contains(text(),'$sCountry')]");

    public static final Target SELECT_BIRTH_YEAR = Target.the("options to select the birth year")
            .located(By.xpath("//select[@id='yearbox']"));

    public static final Target SELECT_BIRTH_MONTH = Target.the("options to select the birth month")
            .located(By.xpath("//select[@ng-model='monthbox']"));

    public static final Target SELECT_BIRTH_DAY = Target.the("options to select birth day")
            .located(By.xpath("//select[@id='daybox']"));

    public static final Target INPUT_PASS = Target.the("where we write the password")
            .located(By.xpath("//input[@id='firstpassword' and @type='password']"));

    public static final Target INPUT_CONFIRM_PASS = Target.the("where we confirm the password")
            .located(By.xpath("//input[@id='secondpassword' and @type='password']"));

    public static final Target SUBMIT_BUTTON = Target.the("the submit button")
            .located(By.xpath("//button[@id='submitbtn' and @type='submit']"));

    public static final Target CONFIRM_TEXT = Target.the("The text to confirm we are registrated")
            .located(By.xpath("//h4[contains(text(), '- Double Click')]"));


}
