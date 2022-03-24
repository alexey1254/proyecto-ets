# Especificacion de casos de uso

## Esta especificación se basa en nuestro proyecto [GestiNess](CasoDeUsoProyecto-CasosDeUso2.0.drawio_1.png)

## __Actores__

- ### Cliente

    |  Actor | Cliente |
    |---|---|
    | Descripción  | Es la persona que va a la tienda a comprar  |
    | Características  |  |
    | Relaciones | Empleado |
    | Referencias | Realizar compra, buscar producto |
    |  Notas |  |
    | Autor  | Alejandro Marrero Cabrera |
    |Fecha | 23/03/2022 |

- ### Administrador

    |  Actor | Administrador |
    |---|---|
    | Descripción  | Jefe de la empresa  |
    | Características  |  |
    | Relaciones | Cliente, empleado |
    | Referencias | Puede hacer todos los casos de uso |
    |  Notas |  |
    | Autor  | Alejandro Marrero Cabrera |
    |Fecha | 23/03/2022 |

- ### Empleado

    |  Actor | Empleado |
    |---|---|
    | Descripción  | Cualquier empleado que trabaje en la empresa  |
    | Características  |  |
    | Relaciones | Administrador, Cliente |
    | Referencias | Buscar producto, realizar compra, Realizar envío, gestionar stock, gestionar proveedor, gestionar cliente |
    |  Notas |   |
    | Autor  | Alejandro Marrero Cabrera |
    |Fecha | 23/03/2022 |

## __Casos de uso__

- ### Buscar producto

    |  Caso de Uso CU | Buscar producto  |
    |---|---|
    | Fuentes  | [Este caso de uso se sustenta aqui](CasoDeUsoProyecto-CasosDeUso2.0.drawio_1.png)  |
    | Actor  | Cliente, empleado, administrador |
    | Descripción | Busca cualquier producto publicado por la empresa |
    | Flujo básico | Validarse -> Buscar producto |
    | Pre-condiciones | Validarse |  
    | Post-condiciones  |  |  
    |  Requerimientos |  |
    |  Notas |  |
    | Autor  | Alejandro Marrero Cabrera |
    |Fecha | 24/03/2022 |

- ### Realizar compra

    |  Caso de Uso CU | Realizar compra  |
    |---|---|
    | Fuentes  | [Este caso de uso se sustenta aqui](CasoDeUsoProyecto-CasosDeUso2.0.drawio_1.png)  |
    | Actor  | Cliente |
    | Descripción | El cliente realiza la compra, puede recoger y devolver el pedido |
    | Flujo básico | Validarse -> Buscar producto -> Realizar compra |
    | Pre-condiciones | Tarjeta de credito/debito, dinero en metálico, PayPal o Bizum |  
    | Post-condiciones  | Solicitar envío |  
    |  Requerimientos | Estar registrado y haber iniciado sesión (validarse) |
    |  Notas | Solo se devuelve si el pedido esta en su caja y sin signos de uso |
    | Autor  | Alejandro Marrero Cabrera |
    |Fecha | 24/03/2022 |

- ### Realizar envío

    |  Caso de Uso CU | Realizar envío  |
    |---|---|
    | Fuentes | [Este caso de uso se sustenta aqui](CasoDeUsoProyecto-CasosDeUso2.0.drawio_1.png)  |
    | Actor | Empleado, Administrador |
    | Descripción | Cuando el pago ha sido confirmado, el envío lo realiza un empleado de la empresa o el mismo Administrador |
    | Flujo básico | Realizar compra -> Solicitar envío -> Realizar envío |
    | Pre-condiciones |  |  
    | Post-condiciones | Realizar envío |  
    | Requerimientos | Confirmación de compra |
    | Notas |  |
    | Autor | Alejandro Marrero Cabrera |
    | Fecha | 24/03/2022 |

- ### Gestionar stock

    |  Caso de Uso CU | Gestionar stock  |
    |---|---|
    | Fuentes | [Este caso de uso se sustenta aqui](CasoDeUsoProyecto-CasosDeUso2.0.drawio_1.png)  |
    | Actor | Administrador, Empleado |
    | Descripción | Este caso de uso sirve para dar de alta, dar de baja, ver productos y editarlos en nuestro stock |
    | Flujo básico |  |
    | Pre-condiciones | Validarse |  
    | Post-condiciones |  |  
    | Requerimientos | Ser Empleado o Administrador |
    | Notas |  |
    | Autor | Alejandro Marrero Cabrera |
    | Fecha | 24/03/2022 |

- ### Gestionar proveedor

    |  Caso de Uso CU | Gestionar proveedor  |
    |---|---|
    | Fuentes | [Este caso de uso se sustenta aqui](CasoDeUsoProyecto-CasosDeUso2.0.drawio_1.png)  |
    | Actor | Empleado, Administrador |
    | Descripción | Este caso de uso sirve para dar de alta, dar de baja, ver proveedores y editar proveedores o eliminarlos |
    | Flujo básico |  |
    | Pre-condiciones | Validarse |  
    | Post-condiciones |  |  
    | Requerimientos | Ser Administrador o Empleado |
    | Notas | Al editar un proveedor se puede eliminar |
    | Autor | Alejandro Marrero Cabrera |
    | Fecha | 24/03/2022 |

- ### Gestionar horarios

    |  Caso de Uso CU | Gestionar horarios  |
    |---|---|
    | Fuentes | [Este caso de uso se sustenta aqui](CasoDeUsoProyecto-CasosDeUso2.0.drawio_1.png)  |
    | Actor | Administrador, Empleado |
    | Descripción | Con este caso de uso, el administrador de la empresa puede crear horarios, verlos y editarlos pero el empleado solo podrá ver su horario |
    | Flujo básico |  |
    | Pre-condiciones | Validarse |  
    | Post-condiciones |  |  
    | Requerimientos | Ser empleado o Administrador |
    | Notas |  |
    | Autor | Alejandro Marrero Cabrera |
    | Fecha | 24/03/2022 |

- ### Gestionar cliente

    |  Caso de Uso CU | Gestionar cliente |
    |---|---|
    | Fuentes | [Este caso de uso se sustenta aqui](CasoDeUsoProyecto-CasosDeUso2.0.drawio_1.png)  |
    | Actor | Empleado, Administrador |
    | Descripción | Con este caso de uso, el empleado o el administrador puede dar de alta, baja ver y editar los clientes de la empresa |
    | Flujo básico |  |
    | Pre-condiciones | Validarse |  
    | Post-condiciones |  |  
    | Requerimientos | Ser Administrador o Empleado |
    | Notas |  |
    | Autor | Alejandro Marrero Cabrera |
    | Fecha | 24/03/2022 |

- ### Gestionar empleado

    |  Caso de Uso CU | Realizar envío  |
    |---|---|
    | Fuentes | [Este caso de uso se sustenta aqui](CasoDeUsoProyecto-CasosDeUso2.0.drawio_1.png)  |
    | Actor | Administrador |
    | Descripción | Con este caso de uso, el administrador puede dar de alta, baja ver y editar los empleados de la empresa |
    | Flujo básico |  |
    | Pre-condiciones | Validarse |  
    | Post-condiciones |  |  
    | Requerimientos | Ser Administrador |
    | Notas | Al editar, tambien se puede borrar el empleado |
    | Autor | Alejandro Marrero Cabrera |
    | Fecha | 24/03/2022 |
