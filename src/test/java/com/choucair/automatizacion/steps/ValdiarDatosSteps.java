package com.choucair.automatizacion.steps;

import org.openqa.selenium.WebElement;

import com.choucair.automatizacion.pages.ColorLibMainPage;
import com.choucair.automatizacion.util.web.javascript.JavaScriptActions;

import net.thucydides.core.annotations.Step;

public class ValdiarDatosSteps {
	
	ColorLibMainPage colorLibMainPage;
	JavaScriptActions javaScriptActions;

	@Step("Validar que el nombre del autor sea {0}")
	public void validarNombreAutor(String autor) {
		WebElement autorElement = colorLibMainPage.getLblAutorElement(autor);
		javaScriptActions.scrollToElement(autorElement);
		System.out.println(javaScriptActions.getInnerTextOfPage());
		System.out.println(javaScriptActions.getWindowSize().getHeight());
		System.out.println(javaScriptActions.getWindowSize().getWidth());
	}

}
