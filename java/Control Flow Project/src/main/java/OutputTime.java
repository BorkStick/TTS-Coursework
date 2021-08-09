//Now that you have 6 or 7 pieces of information it's time to generate the lottery numbers.  The output will 5 random numbers between 1 and 65, and the "magic ball" between 1 and 75.
//To accomplish this you should have 3 random integers, generated in the same way as in the previous exercises.  You may also want to declare constants for the max values of each set of of numbers.
//
//Generate the "magic ball" first.  It should be the user's favorite quarterback jersey number *or* their lucky number, multiplied by one of the random numbers.  Make sure that the answer is less the max "magic" number of 75; if it is greater than 75 then subtract 75 from the value and that value is now the "magic ball" number.
//
//For the 5 non-magic numbers use your choice of any of the following methods to generate values: (Note that you may have to adjust each value to correct range by adding/subtracting.)
//* Find the 3rd letter of their favorite pet.  Convert that character value to an integer value.
//* Use the two digit model year of their car and add their lucky number to it.
//* Use the random number between 1 and 50, subtracting one of the generated random numbers.
//* Convert the first letter of their favorite actor/actress to an integer and use that value.
//* Convert the last letter of their favorate actor/actress to an integer and use that value.
//* Use the value 42.
//* Use the age of their favorite pet + their car model year.
//* Favorite quarterback number + age of pet + lucky number.
//
//Once all the numbers have been calculated, print them out in this form:
//
//Lottery numbers: 4, 17, 15, 52, 26  Magic ball: 22
//

public class OutputTime {
}
