import java.util.Scanner;

public class AskForInput {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What woudl you like to do");
        System.out.println("add | subtract | multiply | divide | square");
        String test = userInput.nextLine();
        System.out.printf("You have selected %s \n", test);


    }
}
