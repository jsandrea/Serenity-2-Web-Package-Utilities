package com.choucair.automatizacion.steps;

import com.choucair.automatizacion.pages.CargaArchivosPage;
import com.choucair.automatizacion.pages.DemoYahooGuru99Page;
import com.choucair.automatizacion.util.web.files.FileManager;
import com.choucair.automatizacion.util.web.physical.PhysicalActions;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

public class IrAPaginasGuru99Steps {
	
	DemoYahooGuru99Page demoYahooGuru99Page; 
	CargaArchivosPage cargaArchivosPage; 
	FileManager fileManager;
	PhysicalActions physicalActions;
	
	@Step("Abrir pagina demo de Yahoo")
	public void abrirPaginaDemoYahoo() {
		demoYahooGuru99Page.open();
		Serenity.takeScreenshot();
	}

	@Step("Abrir pagina de carga de archivos")
	public void abrirPaginaCargaArchivos() {
		cargaArchivosPage.open();
		Serenity.takeScreenshot();
	}

	@Step("Cargar achivo con Selenium")
	public void cargarAchivo() {
		fileManager.uploadTesFileToElement(cargaArchivosPage.btnSeleccionarArchivo);
		Serenity.takeScreenshot();
	}

	@Step("Cargar Archivos cona acciones fisicas del robot")
	public void cargarAchivoConAccionFisica() {
		cargaArchivosPage.clickSeleccionarArchivo();
		cargaArchivosPage.waitFor(5).second();
		physicalActions.uploadTestFileInDialogBox();
		cargaArchivosPage.waitFor(1).second();
		cargaArchivosPage.clickSeleccionarArchivo();
		cargaArchivosPage.waitFor(5).second();
		physicalActions.uploadFileInDialogBox("src/test/resources/files/TestFile.pdf");
		cargaArchivosPage.waitFor(1).second();
	}

	@Step("Cerrar Ventana")
	public void cerrarVentana() {
		physicalActions.closeWindow();
		System.out.println("Ventana cerrada");
	}

}
