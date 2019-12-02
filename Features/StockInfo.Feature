Feature: Getting Stock Information

  Scenario Outline: Detailing Enterprise Value
    Given I open Goolge Chrome
    And I go to Yahoo Finance "https://uk.finance.yahoo.com/"
    When I search for a stock "<stockName>"
    And I go to the statistics tab
    Then I get the enterprise value
    Then I close the browser

	Examples:
		|stockName|
		| Barratt Development | 
		| BT Group |
		| Verizon |
		| AT&T |
		| Shell |
		| Royal Mail |
		| Land Securities Group |
		| British Land |
		| ABBV |
		| BP |
		
		
	# Barrat Development - Price is a little high at the moment
	# BT Group - There is some uncertaincy especially around the December elections
	#					   Dividend cut may also be likely around the uncertaincy, but BT have
	#   				 taken steps to improve UK IT skill with ambitions to also increase
	#	           fibre broadband across the conutry and take them back to the high street
	# Verizon - high levels of debt, dodgy looking future
	# AT&T - high levels of debt, launching 5G in upcoming weeks, invest more in this over Verizon
	# Shell - Be careful about renewable energy
	# Royal Mail - ignore this one fella
	# Land Securities Group - CEO sold a lot of its shares
	# British Land - future looks uncertain basically
	# ABBV - 
