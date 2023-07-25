package uk.co.library.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I enter job title {string}")
    public void iEnterJobTitle(String jTitle) {
        new HomePage().enterJobTitle(jTitle);
    }

    @And("I enter location {string}")
    public void iEnterLocation(String cityLocation) {
        new HomePage().enterLocation(cityLocation);
    }

    @And("I enter distance {string}")
    public void iEnterDistance(String distance) {
        new HomePage().selectDistance(distance);
    }

    @And("I click on more search option link")
    public void iClickOnMoreSearchOptionLink() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("I enter salaryMin {string}")
    public void iEnterSalaryMin(String minSalary) {
        new HomePage().enterMinSalary(minSalary);
    }

    @And("I enter salaryMax {string}")
    public void iEnterSalaryMax(String maxSalary) {
        new HomePage().enterMaxSalary(maxSalary);
    }

    @And("I select salary type {string}")
    public void iSelectSalaryType(String sType) {
        new HomePage().selectSalaryType(sType);
    }

    @And("I select job type {string}")
    public void iSelectJobType(String jobType) {
        new HomePage().selectJobType(jobType);
    }

    @And("I click on find job button")
    public void iClickOnFindJobButton() {
        new HomePage().clickOnFindJobsButton();
    }

    @Then("I should see the result message {string}")
    public void iShouldSeeTheResultMessage(String expected) {
        Assert.assertEquals("Result is not displayed", expected,new ResultPage().verifyTheResults(expected));
    }


}
