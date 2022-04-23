package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.JavaUtils;

import java.util.HashMap;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }



    @FindBy(id="Email")
    WebElement emailTextField;

    @FindBy(id="Password")
    WebElement passwordtextField;

    @FindBy(xpath=" //button[text()='Log in']")
    WebElement loginButton;


    HashMap<String, String> lp;

    public void login(String workflowid){
        lp = JavaUtils.readExcelData("Login",workflowid);
        emailTextField.clear();
        waitForElement(2000);
        emailTextField.sendKeys(lp.get("USERNAME"));
        passwordtextField.clear();
        waitForElement(2000);
        passwordtextField.sendKeys(lp.get("PASSWORD"));
        loginButton.click();
    }



}
