#language: es

Característica: Automatizar Floristeriamundoflor

  @Agregar

  Esquema del escenario:  Agregar producto al carrito2

    Dado  Me encuentro en el menu de categorias '<url>'

    Cuando  Y selecciono una categoria
    Y escojo un producto y clic en el boton anadir al  carrito
    Y luego lo elimino del carrito

    Entonces Se visualizara una ventana con el carrito vacio '<ventana>' y '<mensajeEliminar>'


    Ejemplos:
      | url                                   | ventana | producto | producto2 | mensajeEliminar        |
    ##@externaldata@parametros/DatosFloristeria.xlsx@Agregar
   |https://www.floristeriamundoflor.com/   |Carrito   |MDF 0002   |MDF 00025   |Tu carrito está vacío.|
