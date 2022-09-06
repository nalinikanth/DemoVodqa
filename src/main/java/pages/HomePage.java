package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.pageElements.HomePageElements;

public class HomePage extends HomePageElements {

    private WebDriver driver;



    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public WebDriver searchApp(String searchString) throws InterruptedException {
        click(driver, search);
//        enterText(search,searchString);
        search.sendKeys("u");
        search.sendKeys("s");
        search.sendKeys("e");
        search.sendKeys("r");
        Thread.sleep(2000);
        firstElement.click();
        Thread.sleep(1000);
        return driver;
    }



}
