package co.com.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Scroll;
import static co.com.automation.ui.UserInterfacesClass.LBLAMOUNT;

public class ValidateAmountClass implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.wasAbleTo(Scroll.to(
                LBLAMOUNT
        ));
    String textoactual= "258.000";
    String textoesperado = LBLAMOUNT.resolveFor(actor).getText();
    return textoesperado.contains(textoactual);
    }
    public static ValidateAmountClass validarProductos(){
        return new ValidateAmountClass();
    }
}
