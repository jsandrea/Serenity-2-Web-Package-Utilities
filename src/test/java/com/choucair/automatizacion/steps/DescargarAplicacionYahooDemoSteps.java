package com.choucair.automatizacion.steps;

import com.choucair.automatizacion.pages.DemoYahooGuru99Page;
import com.choucair.automatizacion.util.web.files.FileManager;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

public class DescargarAplicacionYahooDemoSteps {

	DemoYahooGuru99Page demoYahooGuru99Page;
	FileManager fileManager;
	
	@Step("Descargar aplicación")
	public void decargarAplicacion() {
		String appPath = fileManager.downloadFileFromElement(demoYahooGuru99Page.btnDownloadNow);
		String appPath2 = fileManager.getFileFromElement(demoYahooGuru99Page.btnDownloadNow)
							         .setDestinationDirectory("target/site/serenity")
							         .setName("msg12.exe")
							         .download();
		Serenity.getCurrentSession().put("appPath", appPath);
		Serenity.getCurrentSession().put("appPath2", appPath2);
	}

}
