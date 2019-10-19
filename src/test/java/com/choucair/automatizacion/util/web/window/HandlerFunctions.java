package com.choucair.automatizacion.util.web.window;

public interface HandlerFunctions {
	
	void goToWindowsByHandle(String Id);
	void goToWindowsByIndex(int index);
	void goToWindowsByTitle(String titile);
	void gotToMainWindow();
	void goToLastWindow();
	
}
