package pages.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WebElementUtils;

public class LocalPageElements extends WebElementUtils {

    @FindBy(id="j_username")
    protected WebElement userName;

    @FindBy(id="j_password")
    protected WebElement password;

    @FindBy(id="submit")
    protected WebElement submit;



}
