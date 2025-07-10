package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import starter.interactions.WaitUntilElement;
import starter.ui.LoginView;

public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntilElement.untilVisible(LoginView.USERNAME, 10),
                SendKeys.of("alice").into(LoginView.USERNAME),
                SendKeys.of("mypassword").into(LoginView.PASSWORD),
                Click.on(LoginView.LOGIN_BUTTON)
        );
    }

}
