import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import support.TestBase;
import tasks.SimularFinanciamentoTask;

public class FinanciarSucessTest extends TestBase {

    @Test
    public void SimularSucess() throws IOException{
        SimularFinanciamentoTask financiar = new SimularFinanciamentoTask(driver);
       financiar.efetuarfinanciar("25,00","25,00","1");
        Assert.assertEquals(financiar.getMenuInicial(), true);
    }
}
