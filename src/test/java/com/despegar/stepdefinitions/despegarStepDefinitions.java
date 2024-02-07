package com.despegar.stepdefinitions;

import com.despegar.tasks.SearchFlights;
import com.despegar.tasks.SelectFlightDates;
import com.despegar.utils.createTheExcelFile;
import com.despegar.questions.TheBestPrice;
import com.despegar.tasks.OpenTheBrowser;
import com.despegar.tasks.SelectDestination;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;

public class despegarStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;

    private Actor Juan = Actor.named("Juan");

    @Before
    public void setUp() {
        Juan.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Juan is on the Despegar home page$")
    public void juan_is_on_the_Despegar_home_page() throws Throwable {

        Juan.wasAbleTo(OpenTheBrowser.on());
}

    @When("^Juan search for flights from \"([^\"]*)\" to \"([^\"]*)\" between \"([^\"]*)\" and \"([^\"]*)\"$")
    public void juan_search_for_flights_from_to_between_and(String firstCity, String secondCity, String InitialDate, String endDate) throws Throwable {
        Juan.attemptsTo(SelectDestination.OriginAndDestination(firstCity,secondCity));
        Juan.attemptsTo(SelectFlightDates.InitialAndEndDates(InitialDate,endDate));
        Juan.attemptsTo(SearchFlights.now());
    }

    @Then("^Juan should see as cheaper prize \"([^\"]*)\"$")
    public void juan_should_see_as_cheaper_prize(String cheaperPrice) throws Throwable {
        Juan.should(seeThat(TheBestPrice.is(),equalTo(cheaperPrice)));
        //assertThat(TheBestPrice.isVisible(Juan), is(equalTo(cheaperPrice)));

    }

    @Then("^An excel should be created, with the prices in him$")
    public void an_excel_should_be_created_with_the_prices_in_him() throws Throwable {
        createTheExcelFile.of(TheBestPrice.sViewedBy(Juan));
    }
}
