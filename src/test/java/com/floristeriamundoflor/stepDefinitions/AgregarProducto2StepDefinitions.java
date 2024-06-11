package com.floristeriamundoflor.stepDefinitions;

import com.floristeriamundoflor.tasks.Agregar2Task;

import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.floristeriamundoflor.userinterface.Agregar2UI.*;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class AgregarProducto2StepDefinitions {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Dado("Me encuentro en el menu de categorias {string}")
    public void meEncuentroEnElMenuDeCategorias(String url) {

        WebDriverManager.chromedriver().setup();
        theActorCalled("Test").wasAbleTo(Open.url(url));

    }


    @Cuando("Y selecciono una categoria")
    public void ySeleccionoUnaCategoria() {

        OnStage.theActorInTheSpotlight().attemptsTo(

                Agregar2Task.on()


        );

    }

    @Y("escojo un producto y clic en el boton anadir al  carrito")
    public void escojoUnProductoYClicEnElBotonAnadirAlCarrito() {

    }

    @Y("luego lo elimino del carrito")
    public void luegoLoEliminoDelCarrito() {

    }

    @Entonces("Se visualizara una ventana con el carrito vacio {string} y {string}")
    public void seVisualizaraUnaVentanaConElCarritoVacio(String ventana, String mensajeEliminar) {

        Ensure.that(LBL_VENTANA).text().isEqualTo(ventana);
        Ensure.that(LBL_MENSAJE).text().isEqualTo(mensajeEliminar);

    }

}
