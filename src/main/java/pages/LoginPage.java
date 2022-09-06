package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.pageElements.LocalPageElements;

public class LoginPage extends LocalPageElements {

    private WebDriver driver;



    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public HomePage login(String name, String passwordText){
        enterText(userName,name);
        enterText(password,passwordText);
        submit.click();
        return new HomePage(driver);
    }

}
