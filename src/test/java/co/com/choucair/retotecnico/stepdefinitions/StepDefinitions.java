package co.com.choucair.retotecnico.stepdefinitions;

import co.com.choucair.retotecnico.model.RetoTecnicoData;
import co.com.choucair.retotecnico.tasks.CreateUser;
import co.com.choucair.retotecnico.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class StepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^access to user creation must be facilitated$")
    public void accessToUserCreationMustBeFacilitated(List<RetoTecnicoData> retoTecnicoData) throws Exception {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenUp.thePage(), CreateUser.onThePage(retoTecnicoData.get(0).getFirstName(),retoTecnicoData.get(0).getLastName(),retoTecnicoData.get(0).getEmail(),retoTecnicoData.get(0).getBirthMonth(),retoTecnicoData.get(0).getBirthDay(),retoTecnicoData.get(0).getBirthYear()));
    }

    @When("^you enter to fill out the requested fields$")
    public void youEnterToFillOutTheRequestedFields(List<RetoTecnicoData> retoTecnicoData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(CreateUser.addAddress(retoTecnicoData.get(0).getCity(),retoTecnicoData.get(0).getZip()));
    }

    @Then("^there is the Join Today button that directs to the creation of the user$")
    public void thereIsTheJoinTodayButtonThatDirectsToTheCreationOfTheUser(List<RetoTecnicoData> retoTecnicoData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(CreateUser.validatePass(retoTecnicoData.get(0).getPassword(),retoTecnicoData.get(0).getConfirmPassword()));
    }
}
