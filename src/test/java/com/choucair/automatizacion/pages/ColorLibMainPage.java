package com.choucair.automatizacion.pages;

import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class ColorLibMainPage extends PageObject {
	
	String lblAutor = "//Strong[text()='$autor']";
	
	public WebElement getLblAutorElement(String autor) {
		return getDriver().findElement(By.xpath(lblAutor.replace("$autor", autor)));
	}

}
