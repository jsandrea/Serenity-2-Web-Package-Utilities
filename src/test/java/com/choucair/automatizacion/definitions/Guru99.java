package com.choucair.automatizacion.definitions;

import com.choucair.automatizacion.steps.CambiarDeVentansSteps;
import com.choucair.automatizacion.steps.DescargarAplicacionYahooDemoSteps;
import com.choucair.automatizacion.steps.IrAPaginasGuru99Steps;
import com.choucair.automatizacion.steps.ValidarAplicacionDemoSteps;

import cucumber.api.java.es.*;
import net.thucydides.core.annotations.Steps;

public class Guru99 {
	
	@Steps
	IrAPaginasGuru99Steps irAPaginasGuru99Steps;
	
	@Steps
 	DescargarAplicacionYahooDemoSteps descargarAplicacionYahooDemoSteps; 
	
	@Steps
	ValidarAplicacionDemoSteps validarAplicacionDemoSteps;
	
	@Steps
	CambiarDeVentansSteps cambiarDeVentansSteps;
	
	@Dado("^que abro la pagina demo de yahoo msn de guru 99$")
	public void que_abro_la_pagina_demo_de_yahoo_msn_de_guru() {
		irAPaginasGuru99Steps.abrirPaginaDemoYahoo();
	}


	@Dado("^descargo la aplicación msn$")
	public void descargo_la_aplicación_msn() {
		descargarAplicacionYahooDemoSteps.decargarAplicacion();
	}

	@Entonces("^verifico que la version del ejecutable sea la (\\d+)$")
	public void verifico_que_la_version_del_ejecutable_sea_la(int version) {
		validarAplicacionDemoSteps.validarVersion(version);
	}
	
	
	@Dado("^que abro la pagina demo de carga de archivo de guru 99$")
	public void que_abro_la_pagina_demo_de_carga_de_archivo_de_guru() {
		irAPaginasGuru99Steps.abrirPaginaCargaArchivos();
	}


	@Entonces("^cargo el archivo de prueba$")
	public void cargo_el_archivo_de_prueba() {
		irAPaginasGuru99Steps.cargarAchivo();
	}
	
	@Entonces("^cargo el archivo de prueba con una acción fisica$")
	public void cargo_el_archivo_de_prueba_con_una_accion_fisica() {
		irAPaginasGuru99Steps.cargarAchivoConAccionFisica();
		irAPaginasGuru99Steps.cerrarVentana();
	}
	
	
	@Dado("^que abro la pagina de popup de guru 99$")
	public void que_abro_la_pagina_de_popup_de_guru() {
		irAPaginasGuru99Steps.ingresarAPaginaPopup();	
	}


	@Dado("^habro una ventana emergente$")
	public void habro_una_ventana_emergente() {
		cambiarDeVentansSteps.abirVentanaEmergente();
	}

	@Cuando("^regreso a la ventana principal$")
	public void regreso_a_la_ventana_principal() {
		cambiarDeVentansSteps.irAVentanaPrincipal();
	}

	@Entonces("^cambio a la ventana emergente por indice ([0-9])$")
	public void cambio_a_la_ventana_emergente_por_indice(int indice) {
		cambiarDeVentansSteps.irAVentanaEmergenteConIndice(indice);
	}
	
	@Dado("^cambio a la ultima ventana$")
	public void cambio_a_la_ultima_ventana() {
		cambiarDeVentansSteps.cambioALaUltimaVentana();
	}

	

}
