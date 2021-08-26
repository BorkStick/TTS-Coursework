import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        SaySomething.main("test");
        AsciiChars.printNumbers();
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();
        System.out.println("\n-----------------------------------");
        UserInteraction.askName();
        System.out.println("Would you like to complete a survey y|n");
        String response = scan.next();
        if(response.equals("y")) {
            Survey.start();
        } else {
            System.out.println("Have a nice day!");

        }









    }
}

