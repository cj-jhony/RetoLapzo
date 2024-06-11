package com.floristeriamundoflor.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class Agregar2UI {

    public static final Target BTN_CATEGORIA = Target.the("Boton seleccionar categoria cumpleaños")
            .locatedBy("//li/a[@href='https://www.floristeriamundoflor.com/product-category/cumpleanos/']");

    public static final Target BTN_IMAGEN = Target.the("Click en la imagen del producto")
            .locatedBy("//a[@href='https://www.floristeriamundoflor.com/product/mdf-00014/']");

    public static final Target BTN_AGREGAR = Target.the("Boton agregar producto")
            .locatedBy("//button[@name='add-to-cart']");
    public static final Target BTN_ELIMINAR = Target.the("Boton eliminar producto")
            .locatedBy("//a[@class='remove']");

    public static final Target LBL_VENTANA = Target.the("Validar la ventana del carrito")
            .locatedBy("//h1[@class='page-title']");

    public static final Target LBL_MENSAJE = Target.the("Validar el mensaje del carrito vacio")
            .locatedBy("//p[@class='cart-empty']");

    private Agregar2UI() {
        throw new UnsupportedOperationException("Utility class");
    }
}
