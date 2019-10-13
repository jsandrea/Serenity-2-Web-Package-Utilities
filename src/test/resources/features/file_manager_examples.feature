	# language: es

Característica: File Manager Implemetation

	@Descargar_yahoo_msn_demo
	Escenario: Descargar aplicación demo de yahoo desde guru 99 
		Dado que abro la pagina demo de yahoo msn de guru 99
		Y descargo la aplicación msn
		Entonces verifico que la version del ejecutable sea la 11
		
	
	@Cargar_archivo
	Escenario: Caragar archivo de prueba en guru99 
		Dado que abro la pagina demo de carga de archivo de guru 99
		Entonces cargo el archivo de prueba
		
