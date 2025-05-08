package co.com.automation.hook;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.util.EnvironmentVariables;

import static co.com.automation.utils.ConstantsClass.WEBURL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WebClass implements Task {
    private EnvironmentVariables environmentVariables;
    @Override
    public <T extends Actor> void performAs(T actor) {
        String pathurl= EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(WEBURL);
        actor.attemptsTo(
        Open.url(pathurl)
        );

    }
    public static WebClass abrirUrl(){
        return instrumented(WebClass.class);
    }
}
