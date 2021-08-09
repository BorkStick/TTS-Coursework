//To read input from the console, one of the easiest ways is to use the framework class Scanner. More details and explanations of several different methods exist on the official documentation site, but a simple example to read a string input is:
//
//Scanner scanner = new Scanner(System.in);
//System.out.print("Enter a string: ");     // type a word and hit enter
//String someString = scanner.next();
//Implement the following:
//
//After the name prompt, ask the user if they wish to continue to the interactive portion. If they enter 'yes' or 'y', continue. Otherwise quit the program with a message to please return later to complete the survey.
//
//Use a loop to repeatedly ask the user some questions. What will be done is to gather some random information from the user and then generate their potential winning Powerball numbers. At the end, ask them if they would like to generate another set of numbers. Note that it may be helpful to put example responses after each question.
//
//Do you have a red car? (yes, no):
//Ask the user for the name of their favorite pet.
//
//Ask the user for the age of their favorite pet. (NOTE: the next() function will not work here, look up what the appropriate Scanner method is to read numbers.)
//
//What is their lucky number?
//
//Do they have a favorite quarterback? If so what is their jersey number?
//
//What is two-digit model year of their car?
//
//What is the first name of their favorite actor or actress?
//
//Enter a random number between 1 and 50.

import java.util.Scanner;

public class UserInteraction {
    //  ask for name
    public static void askName() {
        Scanner userInput = new Scanner(System.in);


        System.out.println("What is your name?");
        String name = userInput.nextLine();
        System.out.printf("Greetings %s! \n", name);
    }

    // ask if they wish to continue y/n
    //  'yes' or 'y', continue
    // if its a no quit the program
    public static void continueYesNo() {

        Scanner input = new Scanner(System.in);
        char character = 'c';

        do {
            System.out.println("Would you like to continue to the interactive portion? \ny|n");
            character = input.next().charAt(0);
        } while (character != 'n' && character != 'N');

        System.out.println("Yall Come Back Now, Ya Hear");
    }

    public static void randomInfo () {
        Scanner userInput = new Scanner(System.in);

        // Ask the user if car red.
        System.out.println("Do you have a red car? (yes, no):");
        String carRed = userInput.nextLine();


        // Ask the user for the name of their favorite pet.
        System.out.println("Name of their favorite pet:");
        String favoritePetName = userInput.nextLine();

        // Ask the user for the age of their favorite pet.
        System.out.println("Age of their favorite pet:");
        String favoritePetAge = userInput.nextLine();

        // What is their lucky number?
        System.out.println("What is your lucky number?");
        String luckyNumber = userInput.nextLine();

        // Do they have a favorite quarterback?  If so what is their jersey number?
        System.out.println("Do they have a favorite quarterback? (y, n):");
        String favoritePet = userInput.nextLine();

        // What is two-digit model year of their car?
        System.out.println("two-digit model year of their car:");
        String carYear = userInput.nextLine();

        // What is the first name of their favorite actor or actress?
        System.out.println("Favorite actor or actress?");
        String favoriteActor = userInput.nextLine();

        // Enter a random number between 1 and 50.
        System.out.println("Enter a random number between 1 and 50");
        String randomNum = userInput.nextLine();


    }

}
