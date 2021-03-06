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
import pages.adminLevel.Overtime_Dashboard.OvertimeReasonsPage;
import pages.adminLevel.Overtime_Dashboard.Overtime_DashboardPage;
import pages.adminLevel.TrainingAndDevelopment_Dashboard.ClientTimePage;
import pages.HomePage;
import pages.LoginPage;

public class OvertimeReasonsSteps {
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
    OvertimeReasonsPage overtimeReasonsPage;

    @When("the Admin goes to the Overtime Reasons screen")
    public void theAdminGoesToTheOvertimeReasonsScreen() {
        homepage.ClickOvertimeDashboardBtn();
        overtime_dashboardPage.ClickOvertimeReasonsBtn();
    }

    @Then("enters overtime reason information")
    public void entersOvertimeReasonInformation() {
        overtimeReasonsPage.EnterOvertimeReaon();
    }

    @And("save the overtime reason")
    public void saveTheOvertimeReason() {
        overtimeReasonsPage.ClickSaveBtn();
    }

}
