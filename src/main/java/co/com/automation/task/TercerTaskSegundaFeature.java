package co.com.automation.task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import static co.com.automation.ui.UserInterfacesClass.BTNDELETEPRODUCT;
import static co.com.automation.ui.UserInterfacesClass.LBLNOMBRECANTIDAD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TercerTaskSegundaFeature implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(LBLNOMBRECANTIDAD),
                Click.on(BTNDELETEPRODUCT)
        );
    }
    public static TercerTaskSegundaFeature borrarProducto(){
        return instrumented(TercerTaskSegundaFeature.class);
    }
}
