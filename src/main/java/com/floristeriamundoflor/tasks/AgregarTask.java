package com.floristeriamundoflor.tasks;

import com.floristeriamundoflor.exeptions.ProductoNoEncontradoException;
import com.floristeriamundoflor.interactions.ScrollJavaScript;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;



import static com.floristeriamundoflor.userinterface.AgregarUI.*;

public class AgregarTask implements Task {

    private String producto;

    public AgregarTask(String producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        System.out.println("Producto: " + producto);

        actor.attemptsTo(
                JavaScriptClick.on(BTN_CATEGORIA),
                ScrollJavaScript.to(BTN_AGREGAR),
                JavaScriptClick.on(BTN_AGREGAR),
                JavaScriptClick.on(BTN_SEGUIR),
                JavaScriptClick.on(BTN_AGREGAR_NUEVO)
        );

        if (!LBL_PRODUCTO2.resolveFor(actor).isPresent()) {
            throw new ProductoNoEncontradoException("No se encuentra el producto a buscar");
        }
    }

    public static AgregarTask withProducto(String producto) {
        return new AgregarTask(producto);
    }
}
