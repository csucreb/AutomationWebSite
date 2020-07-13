package pa.com.banistmo.certificacion.screenplayreto1.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pa.com.banistmo.certificacion.screenplayreto1.userinterface.RegistrationInformationUserInterface;

public class Answer  implements Question<Boolean>{
    private String question;

    public Answer(String question){
        this.question = question;
    }

    public static Answer toThe(String question){
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        String confirmText = Text.of(RegistrationInformationUserInterface.CONFIRM_TEXT).viewedBy(actor).asString();

        if (question.equals(confirmText)){
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }
}
