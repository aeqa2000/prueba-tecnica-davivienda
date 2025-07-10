package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.Wait;
import starter.interactions.WaitUntilElement;
import starter.ui.HomeView;
import starter.ui.LoginView;

public class NavigateTo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntilElement.untilVisible(HomeView.MENU_BUTTON, 20),
                Click.on(HomeView.MENU_BUTTON),
                WaitUntilElement.untilVisible(HomeView.LOGIN_LINK, 20),
                Click.on(HomeView.LOGIN_LINK),
                WaitUntilElement.untilVisible(LoginView.DONT_HAVE_ACCOUNT_LINK, 20),
                Click.on(LoginView.DONT_HAVE_ACCOUNT_LINK)
        );
    }
}
