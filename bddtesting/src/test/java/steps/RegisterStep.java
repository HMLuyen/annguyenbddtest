package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import pageobjects.RegisterPage;
import utilities.DataHelper;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

/**
 * Created by annguyenx1 on 6/29/2017.
 */
public class RegisterStep  extends BaseStep {
    RegisterPage registerPage = new RegisterPage();
    @Given("^user is in the register page$")
    public void go_to_register_page() {
        registerPage.navigateToPage("https://accounts.google.com/SignUp?hl=en");
    }

    @When("^user inputs account information as below$")
    public void input_account_information(DataTable userInformation) {
        String firstName = DataHelper.get_row_data_in_data_table(userInformation, 2, 2);
        String lastName = DataHelper.get_row_data_in_data_table(userInformation, 3, 2);
        registerPage.inputFirstName(firstName);
        registerPage.inputLastName(lastName);
    }

    @And("^user clicks Next step button$")
    public void click_next_step_button() {
        registerPage.clickNextStepBtn();
    }

    @Then("^the error message display as below$")
    public void assert_error_message_displays(String content) {
        assertThat(registerPage.get_text_of_element(By.id("errormsg_0_GmailAddress")),
                 is(equalTo(content)));
    }

    @And("^user waits for 3 second$")
    public void wait_for_second() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
