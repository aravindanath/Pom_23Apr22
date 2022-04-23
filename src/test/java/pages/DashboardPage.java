package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.function.Supplier;

public class DashboardPage extends BasePage{

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    // Object Repo

    @FindBy(xpath = "//span[text()='My Account']")
    WebElement myAccountMenu;

    @FindBy(xpath = "//*[text()='Register']")
    WebElement registerButton;

    @FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
    WebElement dashboardTitle;

    @FindBy(xpath = "(//*[contains(text(),'Catalog')])[1]")
    WebElement catalogMenu;

    @FindBy(xpath = "(//*[contains(text(),' Products')])[1]")
    WebElement productsMenu;

    @FindBy(xpath = "//table[@id='products-grid']/tbody/tr/td[3]")
    List<WebElement> productNames;


    public void navigateToRegisterPage(){
        myAccountMenu.click();
        registerButton.click();
    }


    public void verifyDashboardTitle(){

        assertTitle(dashboardTitle,"Dashboard");

    }

    public void navigateToProduct(){
        catalogMenu.click();
        productsMenu.click();
    }

    public void verifyProductNames(){
        System.out.println("Total Products: "+ productNames.size());
        for(WebElement ele : productNames){
            System.out.println(ele.getText());
        }
    }
}
