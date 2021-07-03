// *Challenge 1
// Write a script that:
// Stores the number of cups (that a person has consumed) in a variable
// If the person has had *less than* 3 cups
// Log a message to the console saying: ("Yes I'll take another cup of coffee.")
// If not
// Log a message to the console saying ("I think I'm okay for now.")

let numberOfCups = 2;

console.log("Number of cups: " + numberOfCups);

if(numberOfCups < 3) {
    console.log("Yes I'll take another cup of coffee.");
} else  {
    console.log("I think I'm okay for now.");
}


// ***Challenge 2***
// Does your car need an oil change?
// Write a script that: Stores the number of miles(that a car has) in a variable
// If the car has *more than* 500 miles
// Log a message to the console saying:("Yes I think I need an oil change.")
// If not
// Log a message to the console saying:("My car doesn't need an oil change yet.")

let numberOfMiles = 501;

console.log("Total Miles: " + numberOfMiles);
if (numberOfMiles > 500) {
    console.log("Yes I think I need an oil change.");
} else {
    console.log("My car doesn't need an oil change yet.")
}
