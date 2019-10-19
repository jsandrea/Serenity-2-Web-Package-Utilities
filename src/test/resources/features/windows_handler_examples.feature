# language: es

Característica: Windows Handler Implemetation

	@Cambiar_de_Ventanas_principal_nombre
	Escenario: Cambio a ventana principal y a ventana emergente por nombre
		Dado que abro la pagina de popup de guru 99
		Y habro una ventana emergente
		Cuando regreso a la ventana principal
		Y habro una ventana emergente
		Cuando regreso a la ventana principal
		Entonces cambio a la ventana emergente por indice 2
		Cuando regreso a la ventana principal
		Y cambio a la ultima ventana
