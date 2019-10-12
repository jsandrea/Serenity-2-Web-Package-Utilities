package com.choucair.automatizacion.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/java_script_examples.feature" , 
				 glue = "com.choucair.automatizacion.definitions", 
				 tags = "@Validar_Autor_ColorLib")
public class TestValidarAutorColorLib {

}
