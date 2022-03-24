# Especificacion de casos de uso

## Esta especificación se basa en nuestro proyecto [GestiNess](CasoDeUsoProyecto-CasosDeUso2.0.drawio_1.png)

## __Actores__

- ### Cliente

    |  Actor | Cliente |
    |---|---|
    | Descripción  | Es la persona que realiza una busqueda o compra |
    | Características  |  |
    | Relaciones |  |
    | Referencias | Realizar Compra, Buscar Producto |
    |  Notas |  |
    | Autores  | Grace Stephanie Caraballo Pose y Alejandro Marrero Cabrera |
    |Fecha | 23/03/2022 |

- ### Administrador

    |  Actor | Administrador |
    |---|---|
    | Descripción  | Jefe de la empresa  |
    | Características  |  |
    | Relaciones | Empleado |
    | Referencias | Realizar Envio, Gestionar Stock, Gestionar Proveedor, Gestionar Horarios, Gestionar Cliente, Gestionar Empleado |
    |  Notas |  |
    | Autores  | Grace Stephanie Caraballo Pose y Alejandro Marrero Cabrera |
    |Fecha | 23/03/2022 |

- ### Empleado

    |  Actor | Empleado |
    |---|---|
    | Descripción  | Cualquier empleado que trabaje en la empresa  |
    | Características  |  |
    | Relaciones | Administrador |
    | Referencias | Realizar Envio, Ver-Gestionar Stock, Ver-Gestionar Proveedor, Ver-Gestionar Horarios, Gestionar Cliente |
    |  Notas |   |
    | Autores  | Grace Stephanie Caraballo Pose y Alejandro Marrero Cabrera |
    |Fecha | 23/03/2022 |

## __Casos de uso__

- ### Buscar Producto

    |  Caso de Uso CU | Buscar Producto |
    |---|---|
    | Fuentes  | [Este caso de uso se sustenta aqui](CasoDeUsoProyecto-CasosDeUso2.0.drawio_1.png)  |
    | Actor  | Cliente |
    | Descripción | Busca cualquier producto publicado por la empresa. |
    | Flujo básico | Validarse -> Buscar Producto |
    | Pre-condiciones | Validarse |  
    | Post-condiciones  |  |  
    |  Requerimientos |  |
    |  Notas |  |
    | Autores  | Grace Stephanie Caraballo Pose y Alejandro Marrero Cabrera |
    |Fecha | 24/03/2022 |

- ### Realizar Compra

    |  Caso de Uso CU | Realizar compra  |
    |---|---|
    | Fuentes  | [Este caso de uso se sustenta aqui](CasoDeUsoProyecto-CasosDeUso2.0.drawio_1.png)  |
    | Actor  | Cliente |
    | Descripción | El cliente realiza la compra |
    | Flujo básico | Validarse -> Buscar Producto -> Realizar Compra |
    | Pre-condiciones | El cliente deberá tener alguno de los métodos de pago con los que se trabaja: Tarjeta de credito/debito, dinero en metálico, PayPal o Bizum |  
    | Post-condiciones  | Solicitar Envío, Recoger,Devolver|  
    |  Requerimientos | Estar registrado y haber iniciado sesión (validarse) |
    |  Notas | |
    | Autores  | Grace Stephanie Caraballo Pose y Alejandro Marrero Cabrera |
    |Fecha | 24/03/2022 |

- ### Realizar Envío

    |  Caso de Uso CU | Realizar Envío  |
    |---|---|
    | Fuentes | [Este caso de uso se sustenta aqui](CasoDeUsoProyecto-CasosDeUso2.0.drawio_1.png)  |
    | Actor | Empleado, Administrador |
    | Descripción | Cuando Cliente solicita el Envio, tanto Empleado como Administrador podrán Realizar Envio.  |
    | Flujo básico | Realizar Compra -> Solicitar Envío -> Realizar Envío |
    | Pre-condiciones | El Clliente deberá Solicitar el Envio |  
    | Post-condiciones | |  
    | Requerimientos | Confirmación de compra |
    | Notas |  |
    | Autores  | Grace Stephanie Caraballo Pose y Alejandro Marrero Cabrera |
    | Fecha | 24/03/2022 |

- ### Gestionar Stock

    |  Caso de Uso CU | Gestionar Stock  |
    |---|---|
    | Fuentes | [Este caso de uso se sustenta aqui](CasoDeUsoProyecto-CasosDeUso2.0.drawio_1.png)  |
    | Actor | Administrador, Empleado |
    | Descripción | Este caso de uso sirve para que Administrador pueda Dar Alta, Dar Baja, Ver y Editar productos en stock. Mientras que Empleado solo podrá Ver el stock. |
    | Flujo básico | Validarse -> Gestionar Stock |
    | Pre-condiciones | Validarse |  
    | Post-condiciones |  |  
    | Requerimientos | Ser Empleado o Administrador |
    | Notas | Al editar un producto se puede eliminar |
    | Autores  | Grace Stephanie Caraballo Pose y Alejandro Marrero Cabrera |
    | Fecha | 24/03/2022 |

- ### Gestionar Proveedor

    |  Caso de Uso CU | Gestionar proveedor  |
    |---|---|
    | Fuentes | [Este caso de uso se sustenta aqui](CasoDeUsoProyecto-CasosDeUso2.0.drawio_1.png)  |
    | Actor | Empleado, Administrador |
    | Descripción | Este caso de uso sirve para que Administrador pueda Dar Alta, Dar Baja, Ver y Editar proveedores. Mientras que Empleado solo podrá Ver proveedores. |
    | Flujo básico | Validarse -> Gestionar Proveedor |
    | Pre-condiciones | Validarse |  
    | Post-condiciones |  |  
    | Requerimientos | |
    | Notas | Al editar un proveedor se puede eliminar |
    | Autores  | Grace Stephanie Caraballo Pose y Alejandro Marrero Cabrera |
    | Fecha | 24/03/2022 |

- ### Gestionar Horarios

    |  Caso de Uso CU | Gestionar Horarios  |
    |---|---|
    | Fuentes | [Este caso de uso se sustenta aqui](CasoDeUsoProyecto-CasosDeUso2.0.drawio_1.png)  |
    | Actor | Administrador, Empleado |
    | Descripción | Este caso de uso sirve para que Administrador pueda Ver, Crear y Editar los horarios de los empleados.Mientras que Empleado solo podrá Ver horario. |
    | Flujo básico | Validarse -> Gestionar Horarios |
    | Pre-condiciones | Validarse |  
    | Post-condiciones |  |  
    | Requerimientos | |
    | Notas |  |
    | Autores  | Grace Stephanie Caraballo Pose y Alejandro Marrero Cabrera |
    | Fecha | 24/03/2022 |

- ### Gestionar Cliente

    |  Caso de Uso CU | Gestionar Cliente |
    |---|---|
    | Fuentes | [Este caso de uso se sustenta aqui](CasoDeUsoProyecto-CasosDeUso2.0.drawio_1.png)  |
    | Actor | Empleado, Administrador |
    | Descripción | Este caso de uso sirve para que Administrador y Empleado puedan Dar Alta, Dar Baja, Ver y Editar clientes. |
    | Flujo básico | Validarse -> Gestionar Cliente |
    | Pre-condiciones | Validarse |  
    | Post-condiciones |  |  
    | Requerimientos | |
    | Notas |  |
    | Autores  | Grace Stephanie Caraballo Pose y Alejandro Marrero Cabrera |
    | Fecha | 24/03/2022 |

- ### Gestionar Empleado

    |  Caso de Uso CU | Gestionar Empleado  |
    |---|---|
    | Fuentes | [Este caso de uso se sustenta aqui](CasoDeUsoProyecto-CasosDeUso2.0.drawio_1.png)  |
    | Actor | Administrador |
    | Descripción | Este caso de uso sirve para que Administrador pueda Dar Alta, Dar Baja, Ver y Editar empleados. |
    | Flujo básico | Validarse -> Gestionar Empleado |
    | Pre-condiciones | Validarse |  
    | Post-condiciones |  |  
    | Requerimientos | Ser Administrador |
    | Notas | Al editar, tambien se puede borrar el empleado |
    | Autores  | Grace Stephanie Caraballo Pose y Alejandro Marrero Cabrera |
    | Fecha | 24/03/2022 |
