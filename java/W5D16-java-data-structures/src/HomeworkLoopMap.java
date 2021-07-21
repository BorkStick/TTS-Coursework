import java.util.Arrays;
import java.util.Scanner;


public class HomeworkLoopMap {
    public static void main(String[] args) {
        //Ask the user for 5 numbers and store them in an array list.
        //Then find the sum, product, largest, and smallest of those numbers.

        int[] arr = new int[5];

        Scanner userInput = new Scanner(System.in);
        // get user input and add to array
        System.out.println("Enter numbers");
        //loop through 5 times and add input to array
        for (int i = 0; i < 5; i++)
            arr[i] = userInput.nextInt();

        // print out the numbers in the array
        System.out.println("The numbers entered are: " + Arrays.toString(arr));

        // Print out the sum
        System.out.println("Lets add all of these up:");
    }
}
