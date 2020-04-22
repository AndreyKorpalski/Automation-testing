package tasks;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.Simular;

public class SimularFalhaTask {

	private Simular financiar;

	public SimularFalhaTask(WebDriver driver) {
		financiar = new Simular(driver);
	}

	public SimularFalhaTask efetuarSimulacao(String valorAplicar, String valorPoupar, String valorTempo) {
		financiar.getValorAplicarTextField().sendKeys(valorAplicar);
		financiar.getValorPouparTextField().sendKeys(valorPoupar);
		financiar.getValorTempoTextField().sendKeys(valorTempo);
		financiar.getSeleçãoTempoButton().click();
		financiar.getSeleçãoTempoTextField().click();
		financiar.getSimularButton().click();
		
		return this;
	}

	public boolean getMenuInicial() throws IOException {
		return financiar.getMsgErrorAplicarTextField().isDisplayed();
	}
}
