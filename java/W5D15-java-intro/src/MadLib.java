import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {

        // Use the variables below to compose the following paragraph:
        //
        //name, adjective, verbOne, verbTwo, number, yourName

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter name");
        String name = userInput.nextLine();
        System.out.println("Enter adjective");
        String adverb = userInput.nextLine();
        System.out.println("Give me a noun: ");
        String adjective = userInput.nextLine();
        System.out.println("Give me a adjective: ");
        String nounOne = userInput.nextLine();
        System.out.println("Give me another noun");
        String nounTwo = userInput.nextLine();
        System.out.println("Enter number");
        String number = userInput.nextLine();
        System.out.println("Enter your name");
        String yourName = userInput.nextLine();

        //Dear name,
        //
        //You are adverb adjective and I want to be your noun! I want to go to the nounTwo with you in number days.
        //
        //Sincerely, yourName


        System.out.printf("Dear %s \n", name);
        System.out.printf("You are %s %s and I want to be your %s! I want to go to the %s with you in %s days.", adverb, adjective, nounOne, nounTwo, number);
        System.out.printf("Sincerely, %s \n", yourName);






    }
}
