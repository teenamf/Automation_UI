package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.SearchBusPage;

public class SearchBusSteps {
	SearchBusPage searchFPage = new SearchBusPage();

	@Given("^the user launches the url$")
	public void the_user_launches_the_url() throws Throwable {
		searchFPage.launchUrl();
		// searchFPage.manageAlert();
	}

	@When("^user enters departure city$")
	public void user_enters_departure_city() throws Throwable {
		searchFPage.enterDepartureCity();
	}

	@When("^user enters arrival city$")
	public void user_enters_arrival_city() throws Throwable {
		searchFPage.enterToCity();
	}

	@When("^user clicks on depart date picker and select date of departure$")
	public void user_clicks_on_depart_date_picker_and_select_date_of_departure() throws Throwable {
		searchFPage.selectDate();
	}

	@When("^user click on searchBus button$")
	public void user_click_on_searchBus_button() throws Throwable {
		searchFPage.searchBus();
	}

}
