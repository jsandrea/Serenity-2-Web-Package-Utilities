package com.choucair.automatizacion.util.web.files;

public interface FileNamer {
	FileDownloader keepOriginalName();
	FileDownloader setName(String fileName);
}
