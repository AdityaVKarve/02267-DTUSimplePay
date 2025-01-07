package dtu.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
public class RegistrationTest {
    @Given("a customer {string}")
    public void a_customer(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("1");
    }
    @Then("the registration of {string} is complete and a unique integer ID is returned")
    public void the_registration_of_is_complete_and_a_unique_integer_id_is_returned(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("2");
    }

}
