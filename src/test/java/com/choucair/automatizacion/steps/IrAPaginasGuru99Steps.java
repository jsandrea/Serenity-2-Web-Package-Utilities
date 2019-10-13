package com.choucair.automatizacion.steps;

import com.choucair.automatizacion.pages.CargaArchivosPage;
import com.choucair.automatizacion.pages.DemoYahooGuru99Page;
import com.choucair.automatizacion.util.web.files.FileManager;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

public class IrAPaginasGuru99Steps {
	
	DemoYahooGuru99Page demoYahooGuru99Page; 
	CargaArchivosPage cargaArchivosPage; 
	FileManager fileManager;

	@Step("Abrir pagina demo de Yahoo")
	public void abrirPaginaDemoYahoo() {
		demoYahooGuru99Page.open();
		Serenity.takeScreenshot();
	}

	public void abrirPaginaCargaArchivos() {
		cargaArchivosPage.open();
		Serenity.takeScreenshot();
	}

	public void cargarAchivo() {
		fileManager.uploadTesFileToElement(cargaArchivosPage.btnSeleccionarArchivo);
		Serenity.takeScreenshot();
	}

}
