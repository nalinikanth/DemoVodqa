package pages.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WebElementUtils;

public class HomePageElements extends WebElementUtils {

    @FindBy(xpath="/html/body/div[1]/div/div[2]/div[1]/div/input")
    protected WebElement search;

    @FindBy(xpath = "//body/div[@id='header']/div/div/div/div/div/a[1]/div[1]/img[1]")
    protected WebElement firstElement;

}
