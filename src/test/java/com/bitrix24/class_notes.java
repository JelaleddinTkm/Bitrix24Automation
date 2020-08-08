package com.bitrix24;

public class class_notes {

    /*

    No new topics.

 	Cucumber framework for bitrix24.

	https://github.com/vasyafomiuk/Bitrix24Automation
#########################

 1. Create a maven project

 2. Add dependencies
  - Selenium WebDriver
  - WebDriverManager
  - Apache POI
  - Cucumber + JUnit/TestNG

 3. Create git repository
  - add .gitignore file
  - git init  | to create local repo for out project
  - git add . | to prepare all files that are not in ignore list for commit
  - git commit -m "first commit" | to tale a snapshot of the project
 4. Go to github, create remote repository with a same name

 5. Copy 2 commands from github (for existing git project). Comeback to your project, and execute those commands  in terminal. (to connect local and remote repositories)

 6. Add configuration.properties file with credentials, connections info, etc.

 7. Create basic packages:

 	pages - we keep here page classes, every page class corresponds to some page in the application
 	   Based on page class --> we create a page object
 	   Page object - it's a storage for web elements
 	   Web Element - represents some HTML element

 	runners
 	   Here we store runner classes. Runner class is used to kick off tests. How many you can have? As many as you need. I had like Smoke test runner, some runner class to run random test scenarios, and lots of regression runner classes, for parallel execution. Now days you don't need to create lots of runner classes, since cucumber 4 you can perform parallel execution only with 1 runner class.
 	   In runner class, we can specify type of reports to generate, we can list features to run/ignore.

 	step_defintions
 		In this class we store code implementation for test scenarios. Usually, we create 1 class per page.
 		In step definition class we create and use page objects.
 		Each and every step definition method supports some test step:

 		Given user is on the landing page  - test step

 		@Given("user is on the landing page")
 		public void user_is_on_the_landing_page(){
 			//code to support that phrase: driver.get("http://qa1.vytrack.com");
 		}

 	utilities - used to store reusable code. What kind of utility classes we can create?
 		- BrowserUtils - useful methods to work with a browser.
 		- ConfigurationReader - to read configuration.properties file properties.
 		- FileUtils - to work with files (read/write)
 		- DatabaseUtils - to work with JDBC, read/write data to/from the database.
 		- DateTimeUtils - work with date and time. For example: in your test case, you must have a user that is exactly 25 years old, or newborn child that is exactly 60 days old.
 		- ExcelUtils - to work with excel files (read/write from/to excel file)
 		- Driver class - this class contains 1 single webdriver object to work with a browser.

 	features folder - here we store all feature files. We can create them based on user stories, but it's not mandatory. In my previous project I was creating feature files based on pages, because development started in waterfall and there was no user stories. For E2E (end-to-end) test cases, I would suggest to create 1 feature file per test case.

8. Add BasePage to the pages package - to store common for all page classes things. Doesn't represent any page from application, so can be abstract.

9. Add Hooks class - to store before and after test/step methods.

break until 12:10

logger - it's more organized sys out.












     */
}
