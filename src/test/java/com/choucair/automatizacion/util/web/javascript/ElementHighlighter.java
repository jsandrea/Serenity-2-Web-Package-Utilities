package com.choucair.automatizacion.util.web.javascript;

import org.openqa.selenium.WebElement;

class ElementHighlighter implements ColorFormats {

	private JavaScriptActions javaScriptActions;
	private WebElement element;
	private String color;
	
	public ElementHighlighter(JavaScriptActions javaScriptActions, WebElement element) {
		this.javaScriptActions = javaScriptActions;
		this.element = element;
	}

	@Override
	public void withColorRGB(int red, int green, int blue) {
		this.color = "RGB(" + red +"," + green + "," + blue + ")";
		highlight();
	}

	@Override
	public void withColorHex(String hexaColor) {
		this.color = hexaColor;
		highlight();
	}

	@Override
	public void withColorName(String colorName) {
		this.color = colorName;
		highlight();
	}
	
	private void highlight() {
		this.javaScriptActions.evaluateJavascript("arguments[0].style.backgroundColor = '" + color + "'", element);
	}

}
