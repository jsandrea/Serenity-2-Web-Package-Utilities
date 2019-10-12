package com.choucair.automatizacion.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AdminTemplatePage extends PageObject {
	
	@FindBy(xpath="//h1[text()='Bootstrap-Admin-Template']")
	public WebElementFacade lblTitulo;

}
