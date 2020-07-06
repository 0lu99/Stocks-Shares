# Yahoo Finance Scraper (for Java)

Before investing in a company, it's always good to take a look at the fundamentals and ensure that the company is not in trouble.
This can easily become a tedious task especially when reviewing multiple establishments. 
This program helps to gather the fundamentals of companies by scraping the necessary web elements and printing them in the console.

![Java CI with Maven](https://github.com/0lu99/YahooFinanceScraper_Java/workflows/Java%20CI%20with%20Maven/badge.svg?branch=master)


## Table of Contents
- [Getting Started](#Getting-Started)
    * [Prerequisites](#Prerequisites)
    * [Cloning](#Cloning)
- [Built with](#Built-with)
- [How to use](#How-to-use)
- [Feature file](#Feature-file)
- [Classes](#Classes)
   * [Page Object Model](#Page-Object-Model)
   * [Step definitions](#Step-Definitions)
   * [Test runner](#Test-Runner)


## Getting Started
These instructions will get you a copy of this project up and running on your local machine for development and testing purposes

### Prerequisites
- Java SE
- Java SDK
- Eclipse

### Cloning
Option 1: Through terminal / cmd
```
git clone https://github.com/0lu99/YahooFinanceScraper_Java.git
```

Option 2: Through Eclipse IDE

![eclipseGitHubImportImage](https://eclipsesource.com/wp-content/uploads/2012/12/12.png)

## Built with
- [Maven](https://maven.apache.org/) - Build automation tool
- [Cucumber](https://cucumber.io/docs/cucumber/) - To help assist BDD through its language parser, Gherkin
- [Selenium](https://www.selenium.dev/) - Collection of tools to automate web browser actions

## Feature file
A feature file consists of a high level description of the scenario that's to be tested. It's written in a language called Gherkin making it easy to understand from all perspectives. I have made use of a scenario outline which allows me to execute the same test scenario for multiple sets of data which I provide through a table
> The feature file can be found at [_.../Features/_](https://github.com/0lu99/YahooFinanceScraper_Java/tree/master/Features)

## Classes
### Page Object Model
Page object model is a common design pattern when writing automation scripts that's used to create an object repository for elements on a web page. It is used to store these web elements as variables as well as creating methods that will peform actions using those elements. The main advantages of using this pattern is that is helps to reduce duplication and increaes reusability by making use of the same web element in different classes and it also helps test maintainance. If each web page throughout the test journey has their own page object model, it'll be easier to keep track of where everything is.

For this project I make use of 2 POM classes, one for the page where the user will search for the stock and the second for the page the user will get the stock info from.

To support Page Object Model Page Facotry, an extension to Page Object is used to help initialise the web element variables like so:
```java
@FindBy (xpath = "//li[7]//a[1]//span[1]")
@CacheLookup
WebElement financialsTab;
```
> The POM classes can be found at [_...Java/src/test/java/pageObjects/_](https://github.com/0lu99/YahooFinanceScraper_Java/tree/master/src/test/java/pageObjects)

### Step Defintions
This is where the code to carry out the autonomous actions are written. The steps in the cucumber feature file are directly mapped to the step definitions that in turn executes a block of code that gets executed when each scenario is ran.
> The step definition class can be found at [_...Java/src/test/java/stepDefinitions/_](https://github.com/0lu99/YahooFinanceScraper_Java/tree/master/src/test/java/stepDefinitions)


### Test Runner
The test runner class defines the location of the feature file and 'glues' it up with the step definition class. It also provides the metadata information that's needed to suucessfully execute the tests.
> The test runner class can be found at [_...Java/src/test/java/testRunner/_](https://github.com/0lu99/YahooFinanceScraper_Java/tree/master/src/test/java/testRunner)


## How to use
As mentioned, this project makes use of Scenario Outline - a Gherkin reference - which will iterate through the same process until it has taken each row in the Examples section beneath it into account.
In order to search for the individual stocks of your choice, all you need to do is edit/add stocks to the examples table within the feature file:

![featureFileGif](http://g.recordit.co/e8IdTXAeho.gif)

For the purpose of the length of the GIF, this scenario shows the event a user searches for Microsoft (MSFT):

![YahooFinanceGif](YahooFinanceGif.gif)
