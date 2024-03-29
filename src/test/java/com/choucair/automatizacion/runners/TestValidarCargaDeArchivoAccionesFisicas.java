package com.choucair.automatizacion.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/physical_actions_examples.feature" , 
				 glue = "com.choucair.automatizacion.definitions", 
				 tags = "@Cargar_archivo")
public class TestValidarCargaDeArchivoAccionesFisicas {

}
