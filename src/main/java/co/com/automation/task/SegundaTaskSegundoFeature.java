package co.com.automation.task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.automation.ui.UserInterfacesClass.*;
import static co.com.automation.utils.ConstantsClass.NUMBER;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class SegundaTaskSegundoFeature implements Task {
    protected String cantidad2;
    public SegundaTaskSegundoFeature(String cantidad2){
        this.cantidad2=cantidad2;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTNPRODUCCUMPLEANOS),
                WaitUntil.the(IMGSECONDPRODUCT, isPresent()).forNoMoreThan(NUMBER).seconds(),
                Scroll.to(LBLNAMEPRODUCTCUMPLEANOS),
                Clear.field(LBLCANTIDAD),
                Enter.theValue(cantidad2).into(LBLCANTIDAD),
                Click.on(BTNADDTOCART)
        );
    }
    public static SegundaTaskSegundoFeature agregarSegundoProducto(String cantidad2){
        return instrumented(SegundaTaskSegundoFeature.class, cantidad2);
    }
}
