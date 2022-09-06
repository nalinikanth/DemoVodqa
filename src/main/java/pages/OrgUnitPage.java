package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.pageElements.OrgUnitPageElements;

public class OrgUnitPage extends OrgUnitPageElements {

    private WebDriver driver;

    public OrgUnitPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public WebDriver addOrgUnit(String orgName, String orgNameShort) throws InterruptedException {
        add.click();
        name.sendKeys(orgName);
        shortName.sendKeys(orgNameShort);
        date.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div[2]/div[1]/div[3]/div/div/div[2]/button[2]/span")).click();
        Thread.sleep(1000);
        save.click();
        Thread.sleep(1000);
        return driver;
    }

}
