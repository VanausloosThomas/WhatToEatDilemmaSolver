# WhatToEatDilemmaSolver

This web app is supposed to solve my problem of never knowing what to cook by providing a database of recipes and the option to auto generate a weekmenu. After creating a menu the app will allow you to generate a shopping list from the ingredients you will need and flag items/ingredients that you should check for availability at home (for example olive oil). You will be able to add extra items to the list which are not related to the menue you created. Normal household products for example. At last the app will support exporting the shopping list and weekmenu to a pdf and mail this to your emailadres.

* Requested features:
	* Add recipes to the app library, these recepies contain:
	 	* Ingredients
	 	* Explenation on how to prepare the recipe
	 	* Labels with additional info (pasta, salad, meat, ...)
	* Add a weekcalender where you can choose a recipe\day or have a random week menu created according to some prefereces you enter 
	* Convert the generated\hand picked week menu into a shopping list where you can add extra items afterwards to complete it.
	* Add events to the calendar that influence the coise of the menue (ex. volleybal training means cook for two days the day before..)
	* Nice to have: export the list to a pdf and mail it to yourself
	* Work with different user accounts and sessions
* Technology:
	* Java 8
	* MySql db
	* Spring boot 
	* Angular
	* Travis CI
	* Maven
* Decisions i make just to learn from them:
	* Use maven
	* Use CI
	* Play with Angular
	* Use a ddd approach (aggregate roots, value obj,...)       	 	

### 16/09/2017:
* Initial setup:
	* Backend: spring boot + maven
	* Frontend: made Angular project
	* CI: connected github repo to TravisCI
	* Made README 	