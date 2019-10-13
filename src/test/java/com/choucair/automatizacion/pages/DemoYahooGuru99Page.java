package com.choucair.automatizacion.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://demo.guru99.com/test/yahoo.html")
public class DemoYahooGuru99Page extends PageObject{
	
	@FindBy(xpath = "//a[text()='Download Now']")
	public WebElementFacade btnDownloadNow;

}
