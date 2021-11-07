$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("RedBus.feature");
formatter.feature({
  "line": 1,
  "name": "Spice Jet Automation",
  "description": "",
  "id": "spice-jet-automation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "To validate if available flights appear with the selected choices",
  "description": "",
  "id": "spice-jet-automation;to-validate-if-available-flights-appear-with-the-selected-choices",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@TC1"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "the user launches the url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters departure city",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters arrival city",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicks on depart date picker and select date of departure",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user click on searchBus button",
  "keyword": "And "
});
formatter.match({
  "location": "SearchBusSteps.the_user_launches_the_url()"
});
formatter.result({
  "duration": 15967428300,
  "status": "passed"
});
formatter.match({
  "location": "SearchBusSteps.user_enters_departure_city()"
});
formatter.result({
  "duration": 1282997300,
  "status": "passed"
});
formatter.match({
  "location": "SearchBusSteps.user_enters_arrival_city()"
});
formatter.result({
  "duration": 1277132100,
  "status": "passed"
});
formatter.match({
  "location": "SearchBusSteps.user_clicks_on_depart_date_picker_and_select_date_of_departure()"
});
formatter.result({
  "duration": 1319098000,
  "status": "passed"
});
formatter.match({
  "location": "SearchBusSteps.user_click_on_searchBus_button()"
});
formatter.result({
  "duration": 88880000,
  "status": "passed"
});
});