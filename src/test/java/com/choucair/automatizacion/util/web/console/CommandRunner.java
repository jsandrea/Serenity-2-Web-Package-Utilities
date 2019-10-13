package com.choucair.automatizacion.util.web.console;

import java.io.IOException;

public class CommandRunner {
	
	public void runCommand(String commandToRun) {
		try {
			Runtime.getRuntime().exec(commandToRun);
		} catch (IOException e) {
			throw new RuntimeException("Command + '" + commandToRun + "' can´t be run", e);
		}
	}

}
