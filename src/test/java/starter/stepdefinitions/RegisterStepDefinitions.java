package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.tasks.FillRegisterForm;
import starter.tasks.NavigateTo;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterStepDefinitions {

    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("a user wants to register a new account")
    public void a_user_wants_to_register_a_new_account() {
        theActorCalled("User").attemptsTo(
                new NavigateTo()
        );
    }

    @When("he navigates to the registration page and he enters our data")
    public void he_navigates_to_the_registration_page() {
        theActorInTheSpotlight().attemptsTo(
            new FillRegisterForm()
        );
    }

}
