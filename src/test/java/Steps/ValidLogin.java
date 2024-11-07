package Steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;


public class ValidLogin extends CommonMethods {

    // Moved main method outside of annotations and ValidLogin class
    public static void main(String[] args) {
       ValidLogin login = new ValidLogin();
       login.user_is_navigated_to_the_application();
    login.the_user_enters_valid_credentials_and("username", "password"); // Replace with actual values
       login.the_user_should_be_clicked_on_login_button();
    }

    // Can optionally extend CommonMethods for reusability
    @Given("the user navigates to the login page")
    public void user_is_navigated_to_the_application() {
        // Logic to open browser and launch application (from CommonMethods)
        openBrowserAndLaunchApplication();
    }
    @When("the user enters valid credentials {string} and {string}")
    public void the_user_enters_valid_credentials_and(String username, String password) {
        // Logic to send text to email and password fields (from CommonMethods)
        sendText(loginPage.userEmailField, username);
        sendText(loginPage.passwordField, password);
    }
    @Then("the user should be clicked on login button")
    public void the_user_should_be_clicked_on_login_button() {
        // Logic to click the login button (from CommonMethods)
        click(loginPage.loginButton);
    }

}