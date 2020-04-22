package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import support.WaitElement;

public class Simular {

    private WaitElement wait;
    
    public Simular(WebDriver driver){
        wait = new WaitElement(driver);
    }

    public WebElement getsessaoTituloTextField() {
        return wait.getConditionsVisible(By.xpath("//h2[@class=\"sessaoTitulo\"]"));
    }

    public WebElement getValorAplicarTextField() {
        return wait.getConditionsVisible(By.xpath("//input[@id=\"valorAplicar\"]"));
    }
    
    public WebElement getValorPouparTextField() {
        return wait.getConditionsVisible(By.xpath("//input[@id=\"valorInvestir\"]"));
    }

    public WebElement getValorTempoTextField() {
        return wait.getConditionsVisible(By.xpath("//input[@id=\"tempo\"]"));
    }

    public WebElement getSeleçãoTempoTextField(){
        return wait.getConditionsVisible(By.xpath("//a[@rel='A']"));
    }
    
    public WebElement getSeleçãoTempoButton(){
        return wait.getConditionsVisible(By.xpath("//a[@class='btSelect']"));
    }

    public WebElement getSimularButton() {
        return wait.getConditionsVisible(By.xpath("//button[@class='btn btnAmarelo btnSimular']"));
    }

    public WebElement getLogoImg() {
        return wait.getConditionsVisible(By.xpath("//div[@class='blocoResultadoSimulacao']"));
    }
    
    public WebElement getMsgErrorAplicarTextField() {
        return wait.getConditionsVisible(By.id("valorAplicar-error"));
    }
    public WebElement getMsgErrorPouparTextField() {
        return wait.getConditionsVisible(By.id("valorInvestir-error"));
    }
    
}
