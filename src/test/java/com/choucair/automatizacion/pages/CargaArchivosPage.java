package com.choucair.automatizacion.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://demo.guru99.com/test/upload/")
public class CargaArchivosPage extends PageObject {
	
	@FindBy(xpath="//input[contains(@id,'uploadfile_0')]")
	public WebElementFacade btnSeleccionarArchivo;

	public void clickSeleccionarArchivo() {
		clickOn(element("//div[@id='file_wraper0']"));
	}

}
