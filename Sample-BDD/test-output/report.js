$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/senthil_rishma/eclipse-workspace/Sample-BDD/src/test/resources/com/cucumber/Demo.feature");
formatter.feature({
  "name": "FreeCRM appication login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Launch the application",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Launch the url of the application",
  "keyword": "Given "
});
formatter.match({
  "location": "DeositeStepDefination.launch_the_url_of_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the user name and password to login",
  "keyword": "When "
});
formatter.match({
  "location": "DeositeStepDefination.enter_the_user_name_and_password_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the contacs menu",
  "keyword": "Then "
});
formatter.match({
  "location": "DeositeStepDefination.click_on_the_contacs_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the New in conact",
  "keyword": "And "
});
formatter.match({
  "location": "DeositeStepDefination.click_on_the_New_in_conact()"
});
formatter.result({
  "status": "passed"
});
});