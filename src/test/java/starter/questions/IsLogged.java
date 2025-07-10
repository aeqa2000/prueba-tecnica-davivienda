package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.ui.LoggedInAreaView;

public class IsLogged implements Question {

    @Override
    public String answeredBy(Actor actor) {
        return LoggedInAreaView.WELCOME_MESSAGE.resolveFor(actor)
                .getText();
    }

    public static Question<String> value() {
        return new IsLogged();
    }

}
