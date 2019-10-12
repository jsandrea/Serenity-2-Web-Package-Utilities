package com.choucair.automatizacion.steps;

import com.choucair.automatizacion.pages.AdminTemplatePage;
import com.choucair.automatizacion.pages.IngresoColorLibPage;
import com.choucair.automatizacion.util.web.javascript.JavaScriptActions;

import org.junit.*;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;


public class IngresoColorLibSteps {
	
	IngresoColorLibPage ingresoColorLibPage;
	AdminTemplatePage adminTemplatePage;
	JavaScriptActions JavaScriptActions;
	
	@Step("Abrir pagina ColorLib")
	public void abrirPagina() {
		JavaScriptActions.goToUrl("https://colorlib.com/polygon/metis/login.html");
		if (JavaScriptActions.isPageReady()) {
			Assert.assertEquals("https://colorlib.com/polygon/metis/login.html", JavaScriptActions.getUrl());
		}
		Serenity.takeScreenshot();
	}

	@Step("Ingresar usuario {0} y clave {1}")
	public void ingresarUsuarioYClave(String usuario, String clave) {
		JavaScriptActions.sendKeysToElement(usuario, ingresoColorLibPage.txtUsuario);
		JavaScriptActions.sendKeysToElement(clave, ingresoColorLibPage.txtClave);
		Serenity.takeScreenshot();
	}

	@Step("Iniciar session")
	public void iniciarSession() {
		JavaScriptActions.clickOn(ingresoColorLibPage.btnInicio);		
		JavaScriptActions.stopTestFor(2).seconds();
		JavaScriptActions.showMessage("Titulo de Pagina: " + JavaScriptActions.getTitle());
		JavaScriptActions.getAlert().accept();
		JavaScriptActions.setZoom(80);
		Serenity.takeScreenshot();
	}

}
