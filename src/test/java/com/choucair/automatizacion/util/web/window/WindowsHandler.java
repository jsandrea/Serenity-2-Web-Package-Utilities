package com.choucair.automatizacion.util.web.window;

import java.util.stream.Collectors;
import net.serenitybdd.core.pages.PageObject;

public class WindowsHandler extends PageObject implements HandlerFunctions {


	@Override
	public void goToWindowsByHandle(String handleId) {
		getDriver().switchTo().window(handleId);
	}
	
	@Override
	public void goToWindowsByIndex(int index) {
		changeWindowByIndex(index);
	}

	@Override
	public void goToWindowsByTitle(String titile) {
		getDriver().switchTo().window(titile);
	}

	@Override
	public void gotToMainWindow() {
		getDriver().switchTo().window(getDriver().getWindowHandles().iterator().next());
	}

	@Override
	public void goToLastWindow() {
		changeWindowByIndex(getDriver().getWindowHandles().size());
	}
	
	private void changeWindowByIndex(int index) {
		getDriver().switchTo().window(getDriver().getWindowHandles().stream().collect(Collectors.toList()).get(index-1));
	}
	

}
