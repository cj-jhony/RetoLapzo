package com.floristeriamundoflor.stepDefinitions;


import com.floristeriamundoflor.questions.ValidateTheMeetingName;
import com.floristeriamundoflor.tasks.AgregarTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.floristeriamundoflor.userinterface.AgregarUI.*;
import static net.bytebuddy.matcher.ElementMatchers.is;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarProductoStepDefinitions {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }


    @Dado("Que me encuentro en el menu de categorias {string}")
    public void queMeEncuentroEnElMenuDeCategorias(String url) {

        WebDriverManager.chromedriver().setup();
        theActorCalled("Test").wasAbleTo(Open.url(url));

    }

    @Cuando("Selecciono una categoria")
    public void seleccionoUnaCategoria() {

        OnStage.theActorInTheSpotlight().attemptsTo(

                AgregarTask.withProducto("producto")


        );

    }

    @Y("escojo un producto y doy clic en el boton anadir al  carrito")
    public void escojoUnProductoYDoyClicEnElBotonAnadirAlCarrito() {

    }

    @Entonces("Se visualizara una ventana con el producto seleccionado {string} y {string} y {string}")
    public void seVisualizaraUnaVentanaConElProductoSeleccionado(String ventana, String producto, String producto2) {

        Ensure.that(LBL_VENTANA).text().isEqualTo(ventana);
        Ensure.that(LBL_PRODUCTO).text().isEqualTo(producto);
        Ensure.that(LBL_PRODUCTO2).text().isEqualTo(producto2);

        OnStage.theActorInTheSpotlight().should(
              GivenWhenThen.seeThat(ValidateTheMeetingName.value(LBL_PRODUCTO2))
       );



    }


}
