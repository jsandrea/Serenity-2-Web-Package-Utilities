package com.choucair.automatizacion.util.web.javascript;

import org.openqa.selenium.WebElement;

class ElementFramer implements ColorFormats {
	
	private JavaScriptActions javaScriptActions;
	private WebElement element;
	private String color;
	
	public ElementFramer(JavaScriptActions javaScriptActions, WebElement element) {
		this.javaScriptActions = javaScriptActions;
		this.element = element;
	}

	@Override
	public void withColorRGB(int red, int green, int blue) {
		this.color = "RGB(" + red +"," + green + "," + blue + ")";
		frameElement();
	}

	@Override
	public void withColorHex(String hexaColor) {
		this.color = hexaColor;
		frameElement();
	}

	@Override
	public void withColorName(String colorName) {
		this.color = colorName;
		frameElement();
	}
	
	
	private void frameElement() {
		javaScriptActions.evaluateJavascript("arguments[0].style.border= '3px solid " + color + "'", element);
	}
	

}
