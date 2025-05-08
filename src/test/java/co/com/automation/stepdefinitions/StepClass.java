package co.com.automation.stepdefinitions;
import co.com.automation.hook.WebClass;
import co.com.automation.questions.ValidateAmountClass;
import co.com.automation.questions.ValidateAmountSecondClass;
import co.com.automation.task.*;
import co.com.automation.utils.TimerClass;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class StepClass {
    @Before
    public void iniciarUsuario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{string} Ingresa a la url de floristeria")
    public void ingresaALaUrlDeFloristeria(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(WebClass.abrirUrl());
        TimerClass.generarTiempo(5);
    }

    @And("Ingresa a la categoria Amor")
    public void ingresaALaCategoriaAmor() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                PrimeraTaskPrimerFeature.ingresaAmor()
        );
        TimerClass.generarTiempo(5);
    }

    @When("Agregue {int} cantidades del producto")
    public void agregueCantidadesDelProducto(int cantidad) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SegundaTaskPrimerFeature.agregarProducto(String.valueOf(cantidad))
        );
        TimerClass.generarTiempo(5);
    }


@Then("Debe de aparecer el valor del producto")
public void debeDeAparecerElValorDelProducto() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidateAmountClass.validarProductos())
        );
   TimerClass.generarTiempo(5);
}


    @Given("{string} Ingresa a la url de floristeria de amor")
    public void ingresaALaUrlDeFloristeriaDeAmor(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(WebClass.abrirUrl());
        TimerClass.generarTiempo(5);
    }

    @And("Ingresa a la categoria cumpleaños")
    public void ingresaALaCategoriaCumpleanos() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                PrimeraTaskSegundaFeature.ingresarCumpleanos()
        );
    }

    @When("Agregue {int} cantidades del producto cunpleaños")
    public void agregueCantidadesDelProductoCunpleanos(int cantidad2) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SegundaTaskSegundoFeature.agregarSegundoProducto(String.valueOf(cantidad2))
        );
        TimerClass.generarTiempo(5);
    }

    @Then("Debe de aparecer el valor del producto cumpleaños")
    public void debeDeAparecerElValorDelProductoCumpleanos() {
    OnStage.theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(ValidateAmountSecondClass.validarProductos())
    );
    }

    @And("Debe de borrar el producto")
    public void debeDeBorrarElProducto() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                TercerTaskSegundaFeature.borrarProducto()
        );
        TimerClass.generarTiempo(5);
    }
}
