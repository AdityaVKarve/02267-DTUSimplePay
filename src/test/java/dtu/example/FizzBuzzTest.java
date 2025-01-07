package dtu.example;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class FizzBuzzTest {
    @When("an input is {int}")
    public void an_input_is(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Fizz");
    }
    @Then("print {int}")
    public void print(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Buzz");
    }
}
