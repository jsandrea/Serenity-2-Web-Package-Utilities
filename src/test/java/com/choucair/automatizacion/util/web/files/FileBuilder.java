package com.choucair.automatizacion.util.web.files;

import java.io.File;

import com.choucair.automatizacion.util.web.console.CommandRunner;

import net.thucydides.core.guice.Injectors;
import net.thucydides.core.webdriver.Configuration;

public class FileBuilder implements DirectorySetter, FileNamer, FileDownloader {

	private String wgetPath = System.getProperty("user.dir") + "\\src\\test\\resources\\files\\manager\\wget.exe";
	private String fileLocation;
	private String destinatonDirectory;
	private String fileName;
	
	public DirectorySetter setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation; 
		return this;
	}
	
	@Override
	public FileNamer setDestinationDirectory(String directory) {
		if (!(new File(directory).isDirectory())) {
			throw new RuntimeException("directory " + directory +  " not valid");
		}
		this.destinatonDirectory = new File(directory).getAbsolutePath();
		return this;
	}

	@Override
	public FileNamer setReportDirectoryAsDestination() {
		this.destinatonDirectory = Injectors.getInjector().getInstance(Configuration.class).getOutputDirectory().getAbsolutePath();
		return this;
	}
	
	@Override
	public FileDownloader keepOriginalName() {
		this.fileName = new File(fileLocation).getName();
		return this;
	}

	@Override
	public FileDownloader setName(String fileName) {
		this.fileName = fileName;
		return this;
	}
	
	@Override
	public String download() {
		String commandToRun = getWgetCommand();
		CommandRunner runner = new CommandRunner();
		runner.runCommand(commandToRun);
		String destinationFile = getDestinationFile();
		return destinationFile;		
	}
	
	private String getWgetCommand() {
		return "\"" + wgetPath + "\" -O \"" + getDestinationFile() + "\" --no-check-certificate " + fileLocation;
	}
	
	private String getDestinationFile() {
		return destinatonDirectory + "\\" + fileName;
	}
	


}
