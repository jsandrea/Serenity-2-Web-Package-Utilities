package com.choucair.automatizacion.util.web.physical;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import net.serenitybdd.core.pages.PageObject;

public class PhysicalActions extends PageObject {
	
	public void closeWindow() {
        try {
        	Robot robot = new Robot();
	        robot.keyPress(KeyEvent.VK_ALT);
	        robot.keyPress(KeyEvent.VK_F4);
	        robot.keyRelease(KeyEvent.VK_ALT);
	        robot.keyRelease(KeyEvent.VK_F4);
        } catch (AWTException e) {
        	throw new RuntimeException("Window can´t be closed");
        }
    }


	public void uploadFileInDialogBox(String filePath) {
		try {	
				File file = new File(filePath);
				if(!file.isFile()) {
					throw new RuntimeException("File " + filePath + " is not valid"); 
				}
				Robot robot = new Robot();	 
				StringSelection ss = new StringSelection(file.getAbsolutePath());												
		        Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		        clipboard.setContents(ss, null);
		        robot.keyPress(KeyEvent.VK_CONTROL);
		        robot.keyPress(KeyEvent.VK_V);
		        waitFor(1).second();
		        robot.keyPress(KeyEvent.VK_ENTER);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        robot.keyRelease(KeyEvent.VK_V);
		     	robot.keyRelease(KeyEvent.VK_ENTER);
		     	waitFor(1).second();
		} catch (AWTException e) {
			throw new RuntimeException("File can´t be uploaded");
		}
	  }
	
	
	public void uploadTestFileInDialogBox() {
		try {	
				File file = new File("src/test/resources/files/TestFile.pdf");
				Robot robot = new Robot();	 
				StringSelection ss = new StringSelection(file.getAbsolutePath());												
		        Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		        clipboard.setContents(ss, null);
		        robot.keyPress(KeyEvent.VK_CONTROL);
		        robot.keyPress(KeyEvent.VK_V);
		        waitFor(1).second();
		        robot.keyPress(KeyEvent.VK_ENTER);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        robot.keyRelease(KeyEvent.VK_V);
		     	robot.keyRelease(KeyEvent.VK_ENTER);
		     	waitFor(1).second();
		} catch (AWTException e) {
			throw new RuntimeException("File can´t be uploaded");
		}
	  }

}
