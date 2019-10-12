package com.choucair.automatizacion.steps;

import com.choucair.automatizacion.pages.ColoresPage;
import com.choucair.automatizacion.pages.MenuPage;
import com.choucair.automatizacion.util.web.javascript.JavaScriptActions;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

public class ValidarColoresSteps {
	
	MenuPage menuPage;
	ColoresPage coloresPage;
	JavaScriptActions javaScriptActions;
	

	@Step("Ir a la Sección Colores")
	public void irASeccionColores() {
		javaScriptActions.clickOn(menuPage.btnComponentes);
		javaScriptActions.stopTestFor(500).milliSeconds();
		javaScriptActions.clickOn(menuPage.btnBgColor);	
	}

	@Step("Verificar Color Rojo")
	public void verificarColorRojo() {
		String elementBorder = javaScriptActions.getElementBorder(coloresPage.lblColorRojo);
		Serenity.takeScreenshot();
		javaScriptActions.frameElement(coloresPage.lblColorRojo)
						 .withColorRGB(255,255,0);
		javaScriptActions.refreshPage();
		Serenity.takeScreenshot();
		javaScriptActions.frameElement(coloresPage.lblColorRojo)
		 				 .withColorRGB(255,255,0);
		Serenity.takeScreenshot();
		javaScriptActions.setElementWithBorder(coloresPage.lblColorRojo, elementBorder);
		Serenity.takeScreenshot();
		
		String elementBackground = javaScriptActions.getElementBackground(coloresPage.lblColorRojo);
		javaScriptActions.highlightElement(coloresPage.lblColorRojo)
						 .withColorName("yellow");
		Serenity.takeScreenshot();
		javaScriptActions.setElementWithBackGround(coloresPage.lblColorRojo, elementBackground);
		Serenity.takeScreenshot();
	}	
}
