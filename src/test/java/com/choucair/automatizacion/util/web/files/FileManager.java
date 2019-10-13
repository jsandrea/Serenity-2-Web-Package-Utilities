package com.choucair.automatizacion.util.web.files;

import java.io.File;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;

public class FileManager extends PageObject {
	
	public void uploadFileToElement(File file, WebElement element) {
		element.sendKeys(file.getAbsolutePath());
	}
	
	public void uploadTesFileToElement(WebElement element) {
		element.sendKeys(new File("src/test/resources/files/TestFile.pdf").getAbsolutePath());
	}
	
	public String downloadFileFromElement(WebElement element) {
		String fileLocation = getFilePathFromElement(element);
		String destinationFile = new FileBuilder().setFileLocation(fileLocation)
						 						  .setReportDirectoryAsDestination()
						 						  .keepOriginalName()
						 						  .download();
		return destinationFile;
	}

	public DirectorySetter getFileFromElement(WebElement element) {
		String fileLocation = getFilePathFromElement(element);
		return new FileBuilder().setFileLocation(fileLocation);
	}
	
	private String getFilePathFromElement(WebElement element) {
		return element.getAttribute("href");
	}
		

}
