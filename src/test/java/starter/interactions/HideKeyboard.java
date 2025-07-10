package starter.interactions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.HasOnScreenKeyboard;
import io.appium.java_client.HidesKeyboard;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.webdriver.WebDriverFacade;

public class HideKeyboard implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        // 1. “Desempaquetar” el WebDriver real que Serenity envuelve
        WebDriverFacade facade   = (WebDriverFacade) BrowseTheWeb.as(actor).getDriver();
        AppiumDriver driver   = (AppiumDriver) facade.getProxiedDriver();

        // 2. Verificar si el teclado está visible
        if (((HasOnScreenKeyboard) driver).isKeyboardShown()) {   // ✔︎
            ((HidesKeyboard) driver).hideKeyboard();              // sólo ahora lo oculto
        }
        // Si no hay teclado, no hago nada → no se envía BACK → la app no se cierra
    }

    /** Entrada fluida */
    public static HideKeyboard now() {          // renombrado: era ‘HideKeyword’
        return new HideKeyboard();
    }
}