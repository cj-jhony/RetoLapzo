#language: es

Característica: Automatizar Floristeriamundoflor

  @Agregar

  Esquema del escenario: Agregar producto al carrito

    Dado  Que me encuentro en el menu de categorias '<url>'

    Cuando Selecciono una categoria
    Y escojo un producto y doy clic en el boton anadir al  carrito

    Entonces Se visualizara una ventana con el producto seleccionado '<ventana>' y '<producto>' y '<producto2>'

    Ejemplos:
      | url                                   | ventana | producto | producto2 | mensajeEliminar        |
    ##@externaldata@parametros/DatosFloristeria.xlsx@Agregar
   |https://www.floristeriamundoflor.com/   |Carrito   |MDF 0002   |MDF 00025   |Tu carrito está vacío.|
