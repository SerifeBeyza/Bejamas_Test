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
  "name": "user able to see \"6\" different items on each page",
  "keyword": "And "
});
formatter.match({
  "location": "Bejamas.step_definitions.Pagination_step_Def.user_able_to_see_different_items_on_each_page(java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003c6\u003e but was:\u003c4\u003e\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:835)\r\n\tat org.junit.Assert.assertEquals(Assert.java:120)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat Bejamas.step_definitions.Pagination_step_Def.user_able_to_see_different_items_on_each_page(Pagination_step_Def.java:59)\r\n\tat ✽.user able to see \"6\" different items on each page(file:///C:/Users/Asus/IdeaProjects/Bejamas_Test/src/test/resources/features/SelectedFeatures.feature:19)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user navigate to page \"2\" on listed product page",
  "keyword": "And "
});
formatter.match({
  "location": "Bejamas.step_definitions.Pagination_step_Def.user_navigate_to_page_on_listed_product_page(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user able to understand which page she is on",
  "keyword": "Then "
});
formatter.match({
  "location": "Bejamas.step_definitions.Pagination_step_Def.user_able_to_understand_which_page_she_is_on()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "prev arrow be hidden at page \"1\" and next arrow hidden last page \"3\"",
  "keyword": "And "
});
formatter.match({
  "location": "Bejamas.step_definitions.Pagination_step_Def.prev_arrow_be_hidden_at_page_and_next_arrow_hidden_last_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});