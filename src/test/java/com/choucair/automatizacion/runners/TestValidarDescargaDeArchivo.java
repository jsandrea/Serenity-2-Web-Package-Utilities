package com.choucair.automatizacion.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/file_manager_examples.feature" , 
				 glue = "com.choucair.automatizacion.definitions", 
				 tags = "@Descargar_yahoo_msn_demo")
public class TestValidarDescargaDeArchivo {

}
