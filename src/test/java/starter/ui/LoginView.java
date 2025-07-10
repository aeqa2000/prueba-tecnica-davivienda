package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginView {

    public static final Target DONT_HAVE_ACCOUNT_LINK = Target.the("Don't have an account link")
            .located(AppiumBy.androidUIAutomator("new UiSelector().text(\"Don't have an account?\")"));

}
