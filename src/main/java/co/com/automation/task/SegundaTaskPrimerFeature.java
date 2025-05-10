package co.com.automation.task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.automation.ui.UserInterfacesClass.*;
import static co.com.automation.utils.ConstantsClass.LOGGER;
import static co.com.automation.utils.ConstantsClass.NUMBER;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class SegundaTaskPrimerFeature implements Task {

    protected String cantidad;
    public SegundaTaskPrimerFeature(String cantidad){
        this.cantidad= cantidad;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        boolean imageninicial= Visibility.of(BTNFIRSTPRODUCT).answeredBy(actor);
        if (imageninicial){
            actor.attemptsTo(
                   Click.on(BTNFIRSTPRODUCT),
                    WaitUntil.the(IMGFIRSTPRODUC, isPresent()).forNoMoreThan(NUMBER).seconds(),
                    Scroll.to(LBLNAMEPRODUCT),
                    Clear.field(LBLCANTIDAD),
                    Enter.theValue(cantidad).into(LBLCANTIDAD),
                    Click.on(BTNADDTOCART)
            );
        } else {
            LOGGER.error("Falló la automatización, no se encontró el elemento");
        }

    }
    public static SegundaTaskPrimerFeature agregarProducto(String cantidad){
        return instrumented(SegundaTaskPrimerFeature.class, cantidad);
    }
}
