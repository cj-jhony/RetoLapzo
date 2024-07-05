package com.floristeriamundoflor.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.floristeriamundoflor.userinterface.Agregar2UI.*;



public class Agregar2Task implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                JavaScriptClick.on(BTN_CATEGORIA),
                JavaScriptClick.on(BTN_IMAGEN),
                JavaScriptClick.on(BTN_AGREGAR),
                JavaScriptClick.on(BTN_ELIMINAR)
        );

    }
    public static Agregar2Task on() {
        return new Agregar2Task();
    }
}
