package com.choucair.automatizacion.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MenuPage extends PageObject {
	
	
	@FindBy(xpath="//span[text()='Components']")
	public WebElementFacade btnComponentes;
	
	@FindBy(xpath="//a[@href='bgcolor.html']")
	public WebElementFacade btnBgColor;

}
