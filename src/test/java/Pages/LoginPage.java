package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;


public class LoginPage extends CommonMethods {

        @FindBy(xpath ="//input[@type='email']")
        public WebElement userEmailField;

        @FindBy(xpath ="//input[@placeholder='ادخل كلمة المرور الخاصة بك']")
        public WebElement passwordField;

        @FindBy(css =".btn-green.login-btn")
        public WebElement loginButton;

        @FindBy(xpath ="//span[@id='spanMessage']")
        public WebElement actualErrorMsg;


        @FindBy(id ="errorMessage")
        public WebElement errorMessageElement;

        public LoginPage() {
            PageFactory.initElements(driver, this);


        }

        public boolean isLoginSuccessful() {
            // Implement logic to check if login was successful
            // For example, check if a specific element is displayed after login
            return true; // Replace with actual condition
        }


    }

