package com.choucair.automatizacion.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class IngresoColorLibPage extends PageObject {
	
	@FindBy(xpath="//input[@placeholder='Username']")
	public WebElementFacade txtUsuario;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	public WebElementFacade txtClave;
	
	@FindBy(xpath="//button[text()='Sign in']")
	public WebElementFacade btnInicio;

		

}
