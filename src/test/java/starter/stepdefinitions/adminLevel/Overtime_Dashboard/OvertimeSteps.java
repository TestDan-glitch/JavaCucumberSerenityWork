package starter.stepdefinitions.adminLevel.Overtime_Dashboard;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import navigation.MWLNavigateTo;
import net.thucydides.core.annotations.Steps;
import pages.adminLevel.Absence_Dashboard.AbsenceDashboardPage;
import pages.adminLevel.Absence_Dashboard.AbsencePage;
import pages.adminLevel.Money_Dashboard.Money_DashboardPage;
import pages.adminLevel.Money_Dashboard.PreparePayrollPage;
import pages.adminLevel.Overtime_Dashboard.OvertimePage;
import pages.adminLevel.Overtime_Dashboard.Overtime_DashboardPage;
import pages.adminLevel.TrainingAndDevelopment_Dashboard.ClientTimePage;
import pages.HomePage;
import pages.LoginPage;

public class OvertimeSteps {
    @Steps
    MWLNavigateTo mwlNavigateTo;
    LoginPage loginpage;
    HomePage homepage;
    ClientTimePage traininganddev;
    AbsenceDashboardPage absenceDashboardPage;
    AbsencePage absencePage;
    Money_DashboardPage money_dashboardPage;
    Overtime_DashboardPage overtime_dashboardPage;

    PreparePayrollPage preparePayrollPage;
    OvertimePage overtimePage;

    @When("the Admin goes to the Overtime screen")
    public void theAdminGoesToTheOvertimeScreen() {
        homepage.ClickOvertimeDashboardBtn();
        overtime_dashboardPage.ClickOvertimeBtn();
    }

    @Then("enters overtime availability information")
    public void entersOvertimeAvailabilityInformation() {
        overtimePage.EnterOvertimeAvailability();
    }

    @Then("edits overtime availability information")
    public void editsOvertimeAvailabilityInformation() throws InterruptedException {
        overtimePage.EditOvertimeAvailability();
    }

    @And("save the overtime availability")
    public void saveTheOvertimeAvailability() throws InterruptedException {
        overtimePage.ClickAddBtn();
    }


    @Then("delete overtime availability")
    public void deleteOvertimeAvailability() throws InterruptedException {
        overtimePage.ClickDeleteBtn();
    }

}
