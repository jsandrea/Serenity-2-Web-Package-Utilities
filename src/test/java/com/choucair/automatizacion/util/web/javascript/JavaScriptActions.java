package com.choucair.automatizacion.util.web.javascript;
import org.openqa.selenium.WebElement;

/**
 * JavaScript Actions to extends WebBase Automation
 *
 * @author J.Sandrea
 */


import net.serenitybdd.core.pages.PageObject;


public class JavaScriptActions extends PageObject {

	
	@Override
	public void clickOn(WebElement element) {
		evaluateJavascript("arguments[0].click();", element);
	}
	
	public void showMessage(String message) {
		evaluateJavascript("alert('"+ message +"');");
	}
	
	public String getUrl() {
		return (String) evaluateJavascript("return document.URL;");
	}

	public String getTitle() {
		return (String) evaluateJavascript("return document.title;");		
	}

	public void goToUrl(String URL) {
		evaluateJavascript("window.location = '" + URL + "'");
	}
	
	public void refreshPage() {
		evaluateJavascript("history.go(0)");
	}

	public boolean isPageReady() {
		return ((String) evaluateJavascript("return document.readyState")).equals("complete")?true:false;
	}

	public void setZoom(int zoomPercentage) {
		evaluateJavascript("document.body.style.zoom='"+ zoomPercentage + "%'");
	}

	public void sendKeysToElement(String keys, WebElement element) {
		evaluateJavascript("arguments[0].value='"+ keys + "'", element);
	}
	
	public String getInnerTextOfPage() {
		return (String) evaluateJavascript("return document.documentElement.innerText;");
	}
	
	public Long getWidthOfWindow() {
		return (Long) evaluateJavascript("return window.innerWidth;");
	}
	
	public Long getHeightOfWindow() {
		return (Long)  evaluateJavascript("return window.innerHeight;");
	}
	
	public WindowSize getWindowSize() {
		return new WindowSize(getWidthOfWindow(), getHeightOfWindow());
	}
	
	public void scrollRight(int pixelsAmount) {
		evaluateJavascript("window.scrollBy(" + pixelsAmount + ",0)");
	}
	
	public void scrollLeft(int pixelsAmount) {
		evaluateJavascript("window.scrollBy(" + (-1 * pixelsAmount) + ",0)");
	}
	
	public void scrollDown(int pixelsAmount) {
		evaluateJavascript("window.scrollBy(0," + pixelsAmount + ")");
	}
	
	public void scrollUp(int pixelsAmount) {
		evaluateJavascript("window.scrollBy(0," + (-1 * pixelsAmount) + ")");
	}
	
	public void scrollToElement(WebElement element) {
		evaluateJavascript("arguments[0].scrollIntoView(true)" , element);
	}
	
	public String  getElementBackground(WebElement element) {
		return element.getCssValue("background");
	}
	
	public ColorFormats highlightElement(WebElement element) {
		return new ElementHighlighter(this, element);
	}
	
	public void setElementWithBackGround(WebElement element, String elementBackground) {
		evaluateJavascript("arguments[0].style.background = '" + elementBackground + "'", element);
	}
	
	public ColorFormats frameElement(WebElement element) {
		return new ElementFramer(this, element);
	}
	
	public timeFormatsImpl stopTestFor(int time) {
		return new timeFormatsImpl(this, time);
	}
	
	public String getElementBorder(WebElement element) {
		return element.getCssValue("border");
	}
	
	public void setElementWithBorder(WebElement element, String elementBorder) {
		evaluateJavascript("arguments[0].style.border= '" + elementBorder + "'", element);
	}
	
		
}
