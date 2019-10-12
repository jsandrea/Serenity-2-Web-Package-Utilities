# language: es

Característica: Java Script Actions Implemetation

	@Login_ColorLib
	Escenario: Abrir Pagina, Validar si esta lista, obtener URL, enviar texto, detener prueba, mostrar mensaje y hacer zoom
		Dado que abro la pagina de colorlib
		E ingreso el usuario Demo y la clave Demo
		Entonces inicio session
		
	@Validar_Autor_ColorLib
	Escenario: Scroll a Elemento, Obtener Texto Interno de la pagina, obtener tamaño de la pagina
		Dado que incio session en colorlib con el usaurio Demo y la clave Demo
		Entonces verifico que el autor de la pagina se Osman Nuri Okumuş
		
	@Validar_Colores_Background_Frame
	Escenario: Obtener color de Fondo , iluminar elemento, enmarcar elemento
		Dado que incio session en colorlib con el usaurio Demo y la clave Demo
		Cuando voy a la seccion de componentes BG Color
		Entonces verifico que el color rojo
		
	@Validar_Scroll
	Escenario: Verificar scroll arriba y abajo
		Dado que voy a la pagina de javatpoint
		Entonces verifico el scroll
		