package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.Wait;
import starter.interactions.WaitUntilElement;
import starter.ui.HomeView;

public class NavigateTo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntilElement.untilVisible(HomeView.LOGIN_LINK, 20),
                Click.on(HomeView.LOGIN_LINK)
        );
    }
}
