package com.choucair.automatizacion.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/windows_handler_examples.feature" , 
				 glue = "com.choucair.automatizacion.definitions", 
				 tags = "@Cambiar_de_Ventanas_principal_nombre")
public class TestValidarCambioVentanaPrincipalNombre {

}
