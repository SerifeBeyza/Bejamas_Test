$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/SelectedFeatures.feature");
formatter.feature({
  "name": "User should able to land on page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to main page",
  "keyword": "Given "
});
formatter.match({
  "location": "Bejamas.step_definitions.featured_product_step_def.user_navigates_to_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify of Pagination",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "user able to see all page number",
  "keyword": "When "
});
formatter.match({
  "location": "Bejamas.step_definitions.Pagination_step_Def.user_able_to_see_all_page_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user able to see six different items on each page",
  "keyword": "And "
});
formatter.match({
  "location": "Bejamas.step_definitions.Pagination_step_Def.user_able_to_see_six_different_items_on_each_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});