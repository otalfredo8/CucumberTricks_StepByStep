package c03_background.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Background_StepDef {
    @Given("I enter {int}")
    public void iEnter(Integer int1) {
        System.out.println(int1);
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Given("I select {string}")
    public void iSelect(String string) {
        System.out.println(string);
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Given("I click account tab")
    public void iClickAccountTab() {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }

    @When("I scroll to DOB")
    public void iScrollToDOB() {
                System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());}

    @Then("displayed DOB matches DOB in DB")
    public void displayedDOBMatchesDOBInDB() {
                System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());}

    @Given("I click alerts tab")
    public void iClickAlertsTab() {
                System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());}

    @When("alert section is expanded")
    public void alertSectionIsExpanded() {
                System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());}

    @Then("{int} or more alerts are displayed")
    public void orMoreAlertsAreDisplayed(Integer int1) {
                System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());}

    @Given("I click care tab")
    public void iClickCareTab() {
                System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());}

    @When("I expand recent visits section")
    public void iExpandRecentVisitsSection() {
                System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());}

    @Then("if any, information about doctor visits is displayed")
    public void ifAnyInformationAboutDoctorVisitsIsDisplayed() {
                System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());}

    @Given("I click emergency tab")
    public void iClickEmergencyTab() {
                System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());}

    @When("I click hospital details link")
    public void iClickHospitalDetailsLink() {
                System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());}

    @Then("my hospital account opens in a new Window")
    public void myHospitalAccountOpensInANewWindow() {
                System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());}

    @Given("I click drugs tab")
    public void iClickDrugsTab() {
                System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());}

    @When("I organize drug name by date")
    public void iOrganizeDrugNameByDate() {
                System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());}

    @Then("Drugs name list is organized in descending order")
    public void drugsNameListIsOrganizedInDescendingOrder() {
                System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());}
}
