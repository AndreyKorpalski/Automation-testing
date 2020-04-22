package support;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.List;

public class WaitElement {

    private WebDriver driver;

    public WaitElement(WebDriver driver){
        this.driver = driver;
    }

    private FluentWait<WebDriver> getDriver(){
        return new FluentWait<WebDriver>(driver)
                .ignoring(NoSuchElementException.class);
    }

    public WebElement getConditionsVisible(By by){
        return getDriver().until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public WebElement getConditionsPresence(By by){
        return getDriver().until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public List<WebElement> getConditionsPresences(By by){
        return getDriver().until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }
    
    public boolean getInvisibleElement (By by){
    	return getDriver().until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public WebDriver getFrame(By by){
        return getDriver().until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by));
    }
}
