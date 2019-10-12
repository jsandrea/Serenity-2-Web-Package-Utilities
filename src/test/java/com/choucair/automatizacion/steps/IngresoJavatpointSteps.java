package com.choucair.automatizacion.steps;

import com.choucair.automatizacion.pages.LoginJavatpointPage;
import com.choucair.automatizacion.util.web.javascript.JavaScriptActions;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

public class IngresoJavatpointSteps {
	
	LoginJavatpointPage loginJavatpointPage;
	JavaScriptActions javaScriptActions;

	@Step("Abir Pagina JavatPoint")
	public void abrirPagina() {
		loginJavatpointPage.open();
		Serenity.takeScreenshot();
		javaScriptActions.stopTestFor(5).seconds();
	}

	@Step("Realizar scroll abajo")
	public void realizarScrollAbajo() {
		javaScriptActions.scrollDown(1000);
		Serenity.takeScreenshot();
	}

	@Step("Realizar scroll arriba")
	public void realizarScrollArriba() {
		javaScriptActions.scrollUp(500);
		Serenity.takeScreenshot();
	}

}
