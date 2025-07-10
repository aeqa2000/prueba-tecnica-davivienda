package starter.interactions;

import io.appium.java_client.AppiumDriver;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Dimension;

import java.util.HashMap;
import java.util.Map;

public class ScrollToEnd implements Interaction {

    private final int maxSwipes;

    private ScrollToEnd(int maxSwipes) {
        this.maxSwipes = maxSwipes;
    }

    /** Desliza hasta el final (máx. 10 gestos por defecto). */
    public static ScrollToEnd now() {
        return new ScrollToEnd(10);
    }

    /** Permite ajustar el número máximo de gestos. */
    public static ScrollToEnd withMaxSwipes(int maxSwipes) {
        return new ScrollToEnd(maxSwipes);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        // 1. Desempaquetar el driver real que envuelve Serenity
        WebDriverFacade facade = (WebDriverFacade) BrowseTheWeb.as(actor).getDriver();
        AppiumDriver driver = (AppiumDriver) facade.getProxiedDriver();

        // 2. Calcular una “zona segura” (10 % de margen en cada borde)
        Dimension size = driver.manage().window().getSize();
        int marginW = (int) (size.width  * 0.10);
        int marginH = (int) (size.height * 0.10);

        Map<String, Object> params = new HashMap<>();
        params.put("left",    marginW);
        params.put("top",     marginH);
        params.put("width",   size.width  - 2 * marginW);
        params.put("height",  size.height - 2 * marginH);
        params.put("direction", "down");
        params.put("percent",   0.85);          // gesto largo dentro de la zona

        // 3. Deslizar hasta que scrollGesture devuelva false o lleguemos al límite
        int swipesLeft = maxSwipes;
        boolean canScrollMore = true;

        while (canScrollMore && swipesLeft-- > 0) {
            canScrollMore = (Boolean) ((JavascriptExecutor) driver)
                    .executeScript("mobile: scrollGesture", params);
        }
    }
}