package pages.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPageElements {
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/ul[1]/li[2]/a[1]")
    protected WebElement user;

    @FindBy(xpath = "/html/body/div[4]/table/tbody/tr/td[1]/table[1]/tbody/tr[1]/td[2]/input")
    protected WebElement add;

    @FindBy(id = "username")
    protected WebElement username;

    @FindBy(id = "rawPassword")
    protected WebElement rawPassword;

    @FindBy(id = "retypePassword")
    protected WebElement retypePassword;

    @FindBy(id = "surname")
    protected WebElement surname;

    @FindBy(id = "firstName")
    protected WebElement firstName;

    @FindBy(xpath = "/html/body/div[4]/form/table[2]/tbody/tr[2]/td[2]/button[3]")
    protected WebElement addRole;

    @FindBy(xpath = "/html/body/div[4]/form/table[3]/tbody/tr[2]/td[1]/div/ul/li/a")
    protected WebElement addOrgUnit;

    @FindBy(css = "input[value='Add']")
    protected WebElement save;


}
