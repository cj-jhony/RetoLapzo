package com.floristeriamundoflor.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class AgregarUI {

    public static final Target BTN_CATEGORIA = Target.the("Boton seleccionar categoria amor")
            .locatedBy("//a[@href='https://www.floristeriamundoflor.com/product-category/amor/']");


    public static final Target BTN_AGREGAR = Target.the("Boton agregar producto")
            .locatedBy("//a[@href='/product-category/amor/?add-to-cart=4098']");


    public static final Target BTN_SEGUIR = Target.the("Boton seguir comprando producto")
            .locatedBy("//a[@class='button wc-forward']");

    public static final Target BTN_AGREGAR_NUEVO = Target.the("Boton para agregrar nuevo producto")
            .locatedBy("//a[@href='/product-category/amor/?add-to-cart=4069']");
    public static final Target LBL_VENTANA = Target.the("Validar la ventana carrito")
            .locatedBy("//h1[@class='page-title']");

    public static final Target LBL_PRODUCTO = Target.the("Validar primer producto seleccionado")
            .locatedBy("//td[@class='product-name']/a");

    public static final Target LBL_PRODUCTO2 = Target.the("Validar segundo producto seleccionado")
            .locatedBy("//a[contains(text(),'MDF 00025')]");

    private AgregarUI() {
        throw new UnsupportedOperationException("Utility class");
    }


}
