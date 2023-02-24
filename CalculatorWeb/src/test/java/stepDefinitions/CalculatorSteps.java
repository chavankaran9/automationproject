package stepDefinitions;

import PageObjects.CalculatorPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CalculatorSteps

{
    Properties prop = new Properties();
        CalculatorPage Cal = new CalculatorPage();
    public static WebDriver driver;
    public static WebDriverWait wait;
    public String strProjectLoc = System.getProperty("user.dir");

    String chromeDriverLocation=strProjectLoc+"/Drivers/chromedriver.exe";


 @Given("User is on calculator page")
    public void userisoncalculatorpage()
 {
     System.setProperty("webdriver.chrome.driver",chromeDriverLocation);
     driver= new ChromeDriver();
     wait = new WebDriverWait(driver,30);

     driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
     driver.manage().window().maximize();
     driver.get("https://www.calculator.net/");
 }

    @When("User clicks on four")
    public void userclicksonfour() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(Cal.getFour_number())).click();

    }

   @And("User clicks on two")
           public void userclicksontwo()
{
    driver.findElement(By.xpath(Cal.getTwo_number())).click();
}
    @And("User clicks on three")
    public void userclicksonthree()
    {
        driver.findElement(By.xpath(Cal.getThree_number())).click();
    }

    @And("User clicks on {string}")
    public void userclicksmultiplication(String msg) {


     switch (msg)
     {
         case "multiplication":
             driver.findElement(By.xpath(Cal.getMultiplication())).click();
             break;

         case "division":
             driver.findElement(By.xpath(Cal.getDivision())).click();
             break;

         case "addition":
             driver.findElement(By.xpath(Cal.getAddition())).click();
             break;

         case "subtraction":
             driver.findElement(By.xpath(Cal.getSubtraction())).click();
             break;

     }


    }
    @And("User clicks on five")
    public void userclicksonfive()
    {
        driver.findElement(By.xpath(Cal.getFive_number())).click();
    }

    @And("User clicks on zero")
    public void userclicksonzero()
    {
        driver.findElement(By.xpath(Cal.getZero_number())).click();
    }


    @When("User clicks on subtraction")
    public void clicksonsubtraction()
    {
        driver.findElement(By.xpath(Cal.getSubtraction())).click();
    }


    @And("User clicks on eight")
    public void userclickoneight() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(Cal.getEight_number())).click();

    }

    @And("User clicks on nine")
    public void userclickonnine()
    {
        driver.findElement(By.xpath(Cal.getNine_number())).click();

    }

    @Then("Result should be displayed {string}")
    public void userclicksonequalbutton(String compareresult) throws InterruptedException {

        driver.findElement(By.xpath(Cal.getEqualsto())).click();
       String resultpage = driver.findElement(By.xpath(Cal.getActual_result())).getText().trim();
       System.out.println(resultpage);
        Assert.assertEquals(resultpage,compareresult);

        Thread.sleep(2000);

        driver.quit();

    }
}
