import java.util.Scanner;

public class UserInteraction {
    //  ask for name
    public static void askName() {
        Scanner userInput = new Scanner(System.in);


        System.out.println("What is your name");
        String name = userInput.nextLine();
        System.out.printf("Greetings %s \n", name);
    }

    // ask if they wish to continue y/n
    //  'yes' or 'y', continue
    // if its a no quit the program
    public static void continueYesNo() {

        Scanner input = new Scanner(System.in);
        char character = 'c';

        do {
            System.out.println("Would you like to continue to the interactive portion? \n y|n");
            character = input.next().charAt(0);
        } while (character != 'n' && character != 'N');

        System.out.println("Yall Come Back Now, Ya Hear");
    }

}
