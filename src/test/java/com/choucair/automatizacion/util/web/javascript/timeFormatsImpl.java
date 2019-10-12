package com.choucair.automatizacion.util.web.javascript;

//TODO Tested	
public class timeFormatsImpl implements TimeFormats{
	
	private JavaScriptActions javaScriptActions;
	private int time;
	
	public timeFormatsImpl(JavaScriptActions javaScriptActions, int time) {
		this.javaScriptActions = javaScriptActions;
		this.time = time;
	}
	
	public void milliSeconds() {
		stopTime(this.time);
	}
	
	public void seconds() {
		stopTime(this.time * 1000);
	}
	
	public void minutes() {
		stopTime(this.time * 1000 * 60);
	}
	
	private void stopTime(int time) {
		this.javaScriptActions.evaluateJavascript("window.setTimeout(arguments[arguments.length - 1], arguments[0]);", time);
	}
	
}