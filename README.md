# quotes

**This application will read a JSON file which contain alot of quotes.. then each time this app will run, will print out one of these quotes randomly.**

### To run the app:

* In App file.. inside the main method.. there are two path statement .. one of them should be commented out.
* run this command: `./gradlew run`.
* when you have run the program you will se random quote that printed out on the console.

### ______________________________________________

### To test the app:

* There are two ways to run the test for this app.
* either from the CLI:
    1. go to the root directory of the app.
    2. run this command: `./gradlew test`.
* Or from the IDE:
    1. go to the `AppTest` file.
    2. run the method `testQuotes()` from the green triangle on left of it.

# Lab09: (Web request)
* Return data from the api and display it after the connection with internet and send a request to the api. 
* Return a random quote from API: http://api.forismatic.com/api/1.0/?method=getQuote&format=json&lang=en and save it in the JOSN File we have (data.josn)
* if we have a problem in connection the application will read the qoute from the file data.josn .

### To run the app:

* run the main method from intellij . 
* run this command: `./gradlew run` from the terminal.
* when you have run the program you will se random quote that printed out on the console from the api .

### ______________________________________________

### To test the app:

* There are two ways to run the test for this app.
* either from the CLI:
  1. go to the root directory of the app.
  2. run this command: `./gradlew test`.
* Or from the IDE:
  1. go to the `AppTest` file.
  2. run the method `testGetQuoteFromAPI()` and `testGetQuoteFromFileIfThereIsErrorInApi()` from the green triangle on left of it.
