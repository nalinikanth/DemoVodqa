package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.pageElements.UserPageElements;

public class UserPage extends UserPageElements {

    private WebDriver driver;

    public UserPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public WebDriver addUser(String userName, String password, String firstname, String lastname) throws InterruptedException {
        user.click();
        add.click();
        username.sendKeys(userName);
        rawPassword.sendKeys(password);
        retypePassword.sendKeys(password);
        surname.sendKeys(firstname);
        firstName.sendKeys(lastname);
        addRole.click();
        Thread.sleep(1000);
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath("/html[1]/body[1]/div[4]/form[1]/table[3]/tbody[1]/tr[2]/td[1]/div[1]/ul[1]/li[1]/a[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[4]/form[1]/table[3]/tbody[1]/tr[2]/td[3]/div[1]/ul[1]/li[1]/a[1]")).click();
        save.click();
        Assert.assertEquals(driver.getCurrentUrl(),"http://localhost:8085/dhis-web-maintenance-user/user.action?currentPage=1&key=");
        Thread.sleep(10000);
        return driver;
    }

}
