package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoggedInAreaView {

    public static final Target WELCOME_MESSAGE = Target.the("Welcome message")
            .located(AppiumBy.xpath("//android.widget.TextView[contains(@text,\"You are logged in as\")]"));

}
