package starter.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class WaitUntilElement implements Interaction {

    private final Target target;
    private final int seconds;

    public WaitUntilElement(Target target, int seconds) {
        this.target = target;
        this.seconds = seconds;
    }

    /** Factory más descriptiva y sin colisión */
    public static Interaction untilVisible(Target target, int seconds) {
        return Tasks.instrumented(WaitUntilElement.class, target, seconds);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(target, isVisible())
                        .forNoMoreThan(seconds).seconds()
        );
    }
}
