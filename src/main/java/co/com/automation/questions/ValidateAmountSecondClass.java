package co.com.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.automation.ui.UserInterfacesClass.LBLAMOUNTSECONDPRODUCT;

public class ValidateAmountSecondClass implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String textoactual= "129.000";
        String textoesperado = LBLAMOUNTSECONDPRODUCT.resolveFor(actor).getText();
        return textoesperado.contains(textoactual);
    }
    public static ValidateAmountSecondClass validarProductos(){
        return new ValidateAmountSecondClass();
    }
}
