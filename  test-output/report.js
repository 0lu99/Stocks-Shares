$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/StockInfo.feature");
formatter.feature({
  "name": "Getting Stock Information",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Detailing Enterprise Value",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I open Goolge Chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.i_open_Goolge_Chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to Yahoo Finance \"https://uk.finance.yahoo.com/\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.i_go_to_Yahoo_Finance(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for a stock \"AT\u0026T\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.i_search_for_a_stock(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to the statistics tab",
  "keyword": "And "
});
formatter.match({
  "location": "steps.i_go_to_the_statistics_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the enterprise value",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.i_get_the_enterprise_value()"
});
formatter.result({
  "status": "passed"
});
});