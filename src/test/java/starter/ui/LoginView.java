package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginView {

    public static final Target USERNAME = Target.the("Username field").located(AppiumBy.accessibilityId("username"));
    public static final Target PASSWORD = Target.the("Password field").located(AppiumBy.accessibilityId("password"));
    public static final Target LOGIN_BUTTON = Target.the("Login button")
            .located(AppiumBy.accessibilityId("loginBtn"));

}
