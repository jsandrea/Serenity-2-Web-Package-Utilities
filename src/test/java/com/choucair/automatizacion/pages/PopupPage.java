package com.choucair.automatizacion.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://demo.guru99.com/popup.php")
public class PopupPage extends PageObject {
	
	@FindBy(xpath="//a[text()='Click Here']")
	WebElementFacade lnkHere;

	public void clickHere() {
		clickOn(lnkHere);
	}

}
