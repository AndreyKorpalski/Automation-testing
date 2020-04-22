import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import support.TestBase;
import tasks.SimularFalhaTask;

public class FinanciarFailTest extends TestBase {

    @Test
    public void SimularFail() throws IOException{
    	SimularFalhaTask financiar = new SimularFalhaTask(driver);
       financiar.efetuarSimulacao("15,00","15,00","3");
        Assert.assertEquals(financiar.getMenuInicial(), true);
    }
}
