package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import starter.interactions.HideKeyboard;
import starter.interactions.ScrollToEnd;
import starter.interactions.WaitUntilElement;
import starter.ui.CreateAccountView;

public class FillRegisterForm implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntilElement.untilVisible(CreateAccountView.USER_NAME, 20),
                Click.on(CreateAccountView.USER_NAME),
                SendKeys.of("usuario" + (int)(Math.random() * 100) + "").into(CreateAccountView.USER_NAME_FIELD),
                HideKeyboard.now(),
                Click.on(CreateAccountView.EMAIL),
                SendKeys.of("example" + (int)(Math.random() * 100) + "@gmail.com").into(CreateAccountView.EMAIL_FIELD),
                HideKeyboard.now(),
                Click.on(CreateAccountView.PASSWORD),
                SendKeys.of("Password123").into(CreateAccountView.PASSWORD_FIELD),
                HideKeyboard.now(),
                Click.on(CreateAccountView.CONFIRM_PASSWORD),
                SendKeys.of("Password123").into(CreateAccountView.CONFIRM_PASSWORD_FIELD),
                HideKeyboard.now(),
                ScrollToEnd.now(),
                Click.on(CreateAccountView.REGISTER_BUTTON)
        );
    }
}
