package tasks;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import pageObjects.Simular;

public class SimularFinanciamentoTask {

	private Simular financiar;

	public SimularFinanciamentoTask(WebDriver driver) {
		financiar = new Simular(driver);
	}

	public SimularFinanciamentoTask efetuarfinanciar(String valorAplicar, String valorPoupar, String valorTempo) {
		financiar.getValorAplicarTextField().sendKeys(valorAplicar);
		financiar.getValorPouparTextField().sendKeys(valorPoupar);
		financiar.getValorTempoTextField().sendKeys(valorTempo);
		financiar.getSele��oTempoButton().click();
		financiar.getSele��oTempoTextField().click();
		
		return this;
	}

	public boolean getMenuInicial() throws IOException {
		return financiar.getLogoImg().isDisplayed();
	}
}
