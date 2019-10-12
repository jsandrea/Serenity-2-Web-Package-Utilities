package com.choucair.automatizacion.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ColoresPage extends PageObject {
	
	@FindBy(xpath="//li[text()='.bg-bg-red']")
	public WebElementFacade lblColorRojo;

}
