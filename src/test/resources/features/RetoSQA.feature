#author: David Espejo

  Feature: Agregar productos al carrito
    Scenario: Agregar dos productos al carrito de compras de la categoria amor
      Given "David" Ingresa a la url de floristeria
      And Ingresa a la categoria Amor
      When Agregue 2 cantidades del producto
      Then Debe de aparecer el valor del producto

    Scenario: Agregar un producto al carrito de compras de la categoria cumpleaños, agregarlo y eliminarlo
      Given "David" Ingresa a la url de floristeria de amor
      And Ingresa a la categoria cumpleaños
      When Agregue 1 cantidades del producto cunpleaños
      Then Debe de aparecer el valor del producto cumpleaños
      And Debe de borrar el producto