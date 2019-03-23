$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/search.feature");
formatter.feature({
  "name": "Search Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search Feature Testing",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SearchFeature"
    }
  ]
});
formatter.step({
  "name": "user on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchFeature_Steps.user_on_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see confirmation cookie pop up window",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchFeature_Steps.user_should_see_confirmation_cookie_pop_up_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should decline it",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchFeature_Steps.user_should_decline_it()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the search button",
  "keyword": "When "
});
formatter.match({
  "location": "SearchFeature_Steps.user_click_on_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search for \"challenge\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchFeature_Steps.user_search_for(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see auto suggested result items",
  "keyword": "And "
});
formatter.match({
  "location": "SearchFeature_Steps.user_should_see_auto_suggested_result_items()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to open first auto suggested item in the new tab",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchFeature_Steps.user_should_be_able_to_open_first_auto_suggested_item_in_the_new_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to go back to the first tab",
  "keyword": "And "
});
formatter.match({
  "location": "SearchFeature_Steps.user_should_able_to_go_back_to_the_first_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to see results after pressing enter",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchFeature_Steps.user_should_be_able_to_see_results_after_pressing_enter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should open first result in the new tab",
  "keyword": "And "
});
formatter.match({
  "location": "SearchFeature_Steps.user_should_open_first_result_in_the_new_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to go back to the parent tab",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchFeature_Steps.user_should_able_to_go_back_to_the_parent_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searches for \"mixed reality\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchFeature_Steps.user_searches_for(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should open first item in the current tab",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchFeature_Steps.user_should_open_first_item_in_the_current_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify the title of the page",
  "keyword": "And "
});
formatter.match({
  "location": "SearchFeature_Steps.user_verify_the_title_of_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});