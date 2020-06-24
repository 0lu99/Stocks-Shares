# Yahoo Finance Scraper (for Java)

Before investing in a company, it's always good to take a look at the fundamentals and ensure that the company is not in trouble.
This can easily become a tedious task especially when reviewing multiple establishments. 
This program helps to gather the fundamentals of companies by scraping the necessary web elements and printing them in the console.

- [Getting Started](#heading)
    * [Prerequisites](#Prerequisites)
    * [Cloning](#Cloning)
- [Built with](#Built-with)
- [How to use](#How-to-use)


## Getting Started
These instructions will get you a copy of this project up and running on your local machine for development and testing purposes

### Prerequisites
- Java SE
- Java SDK
- Eclipse or an alternative Java IDE

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

## How to use
This project makes use of Scenario Outline - a Gherkin reference - which will iterate through the same process until it has taken each row in the Examples section beneath it into account.
In order to search for the individual stocks of your choice, all you need to do is edit/add stocks to the examples table within the feature file:

![featureFileGif](http://g.recordit.co/e8IdTXAeho.gif)

The console we then return a specified list of fundamentals for Coca-Cola (KO), Pepsi (PEP), Nikola (NKLA) and Paypal (PYPL):

![consoleOutputGif](http://g.recordit.co/R5EYQS8tZp.gif)
