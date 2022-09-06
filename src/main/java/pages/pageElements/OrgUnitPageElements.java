package pages.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrgUnitPageElements {

    @FindBy(xpath="//span[normalize-space()='add']")
    protected WebElement add;

    @FindBy(xpath = "/html/body/div[1]/div/div/main/div[2]/div/div/div[2]/div/div[1]/div[2]/div/input")
    protected WebElement name;

    @FindBy(xpath = "/html/body/div[1]/div/div/main/div[2]/div/div/div[2]/div/div[1]/div[3]/div/input")
    protected WebElement shortName;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]/div[1]/div[1]")
    protected WebElement save;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/input[1]")
    protected WebElement date;

}
