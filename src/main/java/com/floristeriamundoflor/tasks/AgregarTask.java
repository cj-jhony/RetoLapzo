package com.floristeriamundoflor.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;



import static com.floristeriamundoflor.userinterface.AgregarUI.*;

public class AgregarTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                JavaScriptClick.on(BTN_CATEGORIA),
                JavaScriptClick.on(BTN_AGREGAR),
                JavaScriptClick.on(BTN_SEGUIR),
                JavaScriptClick.on(BTN_AGREGAR_NUEVO)

        );

    }
    public static AgregarTask on() {
        return new AgregarTask();
    }
}
