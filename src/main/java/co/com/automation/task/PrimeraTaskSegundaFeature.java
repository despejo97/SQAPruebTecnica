package co.com.automation.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.automation.ui.UserInterfacesClass.BTNCUMPLEANOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PrimeraTaskSegundaFeature implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTNCUMPLEANOS)
        );

    }
    public static PrimeraTaskSegundaFeature ingresarCumpleanos(){
        return instrumented(PrimeraTaskSegundaFeature.class);
    }
}
