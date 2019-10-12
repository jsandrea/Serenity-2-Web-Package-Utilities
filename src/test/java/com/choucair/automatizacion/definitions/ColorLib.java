package com.choucair.automatizacion.definitions;

import com.choucair.automatizacion.steps.IngresoColorLibSteps;
import com.choucair.automatizacion.steps.IngresoJavatpointSteps;
import com.choucair.automatizacion.steps.ValdiarDatosSteps;
import com.choucair.automatizacion.steps.ValidarColoresSteps;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class ColorLib {
	
	@Steps
	IngresoColorLibSteps ingresoColorLibSteps;
	
	@Steps
	ValdiarDatosSteps valdiarDatosSteps;
	
	@Steps
	ValidarColoresSteps validarColoresSteps;
	
	@Steps
	IngresoJavatpointSteps ingresoJavatpointSteps;
	
	@Dado("^que abro la pagina de colorlib$")
	public void que_abro_la_pagina_de_colorlib() throws Exception {
		ingresoColorLibSteps.abrirPagina();
	}


	@Dado("^ingreso el usuario (.*) y la clave (.*)$")
	public void ingreso_el_usuario_Demo_y_la_clave_Demo(String usuario, String clave) throws Exception {
		ingresoColorLibSteps.ingresarUsuarioYClave(usuario, clave);
	}

	@Entonces("^inicio session$")
	public void inicio_session() throws Exception {
		ingresoColorLibSteps.iniciarSession();
	}


	@Dado("^que incio session en colorlib con el usaurio (.*) y la clave (.*)$")
	public void que_incio_session_en_colorlib(String usuario, String clave) throws Exception {
		ingresoColorLibSteps.abrirPagina();
		ingresoColorLibSteps.ingresarUsuarioYClave(usuario, clave);
		ingresoColorLibSteps.iniciarSession();
	}


	@Entonces("^verifico que el autor de la pagina se (.*)$")
	public void verifico_que_el_autor_de_la_pagina_se_Osman_Nuri_Okumuş(String autor) throws Exception {
		valdiarDatosSteps.validarNombreAutor(autor);		
	}
	
	@Cuando("^voy a la seccion de componentes BG Color$")
	public void voy_a_la_seccion_de_componentes_BG_Color() throws Exception {
		validarColoresSteps.irASeccionColores();
	}


	@Entonces("^verifico que el color rojo$")
	public void verifico_que_el_color_rojo() throws Exception {
		validarColoresSteps.verificarColorRojo();
	}
	
	@Dado("^que voy a la pagina de javatpoint$")
	public void que_voy_a_la_pagina_de_javatpoint() {
		ingresoJavatpointSteps.abrirPagina();
	}


	@Entonces("^verifico el scroll$")
	public void verifico_el_scroll() {
		ingresoJavatpointSteps.realizarScrollAbajo();
		ingresoJavatpointSteps.realizarScrollArriba();
	}



	
}
