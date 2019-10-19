package com.choucair.automatizacion.steps;

import com.choucair.automatizacion.pages.PopupPage;
import com.choucair.automatizacion.util.web.window.WindowsHandler;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

public class CambiarDeVentansSteps {

	PopupPage popupPage;
	WindowsHandler windowsHandler;
	
	@Step("Cambiar Ventana Emergente")
	public void abirVentanaEmergente() {
		popupPage.clickHere();
		popupPage.waitFor(2).second();
		Serenity.takeScreenshot();
	}

	
	@Step("Ir a Ventana Principal")
	public void irAVentanaPrincipal() {
		windowsHandler.gotToMainWindow();
		popupPage.waitFor(2).second();
		Serenity.takeScreenshot();
	}

	
	@Step("Cambiar a Ventana Emergente por Indice")
	public void irAVentanaEmergenteConIndice(int indice) {
		windowsHandler.goToWindowsByIndex(indice);
		popupPage.waitFor(2).second();
		Serenity.takeScreenshot();
	}


	@Step("Cambio a la ultima Ventana")
	public void cambioALaUltimaVentana() {
		windowsHandler.goToLastWindow();
		popupPage.waitFor(2).seconds();
	}

}
