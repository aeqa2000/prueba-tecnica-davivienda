package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class HomeView {

    public static final Target LOGIN_LINK = Target.the("Login link")
            .located(AppiumBy.androidUIAutomator("new UiSelector().text(\"Login Screen\")"));

}
