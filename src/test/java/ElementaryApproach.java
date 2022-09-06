import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.OrgUnitPage;
import pages.UserPage;
import utils.Config;
import utils.DriverFactory;


public class ElementaryApproach {

    private WebDriver driver;
    DriverFactory driverFactory;
    HomePage homePage;
    OrgUnitPage orgUnitPage ;
    UserPage userPage;
    LoginPage loginPage;



    @BeforeMethod
    public void setUp(){
        driverFactory=new DriverFactory();
        driver=driverFactory.getDriver();
    }

    @Test
    public void createUser() throws InterruptedException {
        driver.get(Config.URL);
        loginPage=new LoginPage(driver);
        orgUnitPage = new OrgUnitPage(driver);
        userPage = new UserPage(driver);
        homePage = loginPage.login("admin", "district");
        driver = homePage.searchApp("user");

        Faker faker = new Faker();
        String userName = faker.name().username();
        String password = "Tester12";
        String lastname = faker.name().lastName();
        String firstname = faker.name().firstName();



        userPage.addUser(userName,password,lastname,firstname);




    }

    @AfterTest
    public void tearDown(){
        driverFactory.closeDriver();
    }
}
