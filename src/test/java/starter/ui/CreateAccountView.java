package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class CreateAccountView {

    public static final Target USER_NAME = Target.the("User name field")
            .located(AppiumBy.androidUIAutomator("new UiSelector().text(\"USER NAME\")"));

    public static final Target USER_NAME_FIELD = Target.the("User name input field")
            .located(AppiumBy.xpath("//android.widget.RelativeLayout[@resource-id=\"com.Advantage.aShopping:id/AosEditTextUserName\"]/android.widget.EditText"));

    public static final Target EMAIL = Target.the("Email field")
            .located(AppiumBy.androidUIAutomator("new UiSelector().text(\"EMAIL\")"));

    public static final Target EMAIL_FIELD = Target.the("Email input field")
            .located(AppiumBy.xpath("//android.widget.RelativeLayout[@resource-id=\"com.Advantage.aShopping:id/AosEditTextEmail\"]/android.widget.EditText"));

    public static final Target PASSWORD = Target.the("Password field")
            .located(AppiumBy.androidUIAutomator("new UiSelector().text(\"PASSWORD\")"));

    public static final Target PASSWORD_FIELD = Target.the("Password input field")
            .located(AppiumBy.xpath("//android.widget.RelativeLayout[@resource-id=\"com.Advantage.aShopping:id/AosEditTextPassword\"]/android.widget.EditText"));

    public static final Target CONFIRM_PASSWORD = Target.the("Confirm password field")
            .located(AppiumBy.androidUIAutomator("new UiSelector().text(\"CONFIRM PASSWORD\")"));

    public static final Target CONFIRM_PASSWORD_FIELD = Target.the("Confirm password input field")
            .located(AppiumBy.xpath("//android.widget.RelativeLayout[@resource-id=\"com.Advantage.aShopping:id/AosEditTextConfirmPassword\"]/android.widget.EditText"));

    public static final Target FIRST_NAME = Target.the("First name field")
            .located(AppiumBy.androidUIAutomator("new UiSelector().text(\"FIRST NAME\")"));

    public static final Target FIRST_NAME_FIELD = Target.the("First name input field")
            .located(AppiumBy.xpath("//android.widget.RelativeLayout[@resource-id=\"com.Advantage.aShopping:id/AosEditTextFirstName\"]/android.widget.EditText"));

    public static final Target LAST_NAME = Target.the("Last name field")
            .located(AppiumBy.androidUIAutomator("new UiSelector().text(\"LAST NAME\")"));

    public static final Target LAST_NAME_FIELD = Target.the("Last name input field")
            .located(AppiumBy.xpath("//android.widget.RelativeLayout[@resource-id=\"com.Advantage.aShopping:id/AosEditTextLastName\"]/android.widget.EditText"));

    public static final Target PHONE_NUMBER = Target.the("Phone number field")
            .located(AppiumBy.androidUIAutomator("new UiSelector().text(\"PHONE NUMBER\")"));

    public static final Target PHONE_NUMBER_FIELD = Target.the("Phone number input field")
            .located(AppiumBy.xpath("//android.widget.RelativeLayout[@resource-id=\"com.Advantage.aShopping:id/AosEditTextPhoneNumber\"]/android.widget.EditText"));

    public static final Target REGISTER_BUTTON = Target.the("Register button")
            .located(AppiumBy.id("com.Advantage.aShopping:id/buttonRegister"));

}
