package com.choucair.automatizacion.steps;

import java.io.File;
import static org.hamcrest.Matchers.*;
import org.junit.Assert;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;


public class ValidarAplicacionDemoSteps {

	@Step("Validar version {0}")
	public void validarVersion(int version) {
		String appName = new File ((String) Serenity.getCurrentSession().get("appPath")).getName();
		Assert.assertThat(new File(appName).getName(), containsString(String.valueOf(version)));
		
		String appName2 = new File ((String) Serenity.getCurrentSession().get("appPath2")).getName();
		Assert.assertThat(new File(appName2).getName(), containsString("12"));
	}

}
