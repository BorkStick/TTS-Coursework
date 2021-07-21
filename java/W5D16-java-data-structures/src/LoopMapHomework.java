import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class LoopMapHomework {
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

        Arrays.sort(arr);
        System.out.println("The numbers are now sorted: " + Arrays.toString(arr));

        // do math and stuff
        int sum = 0;
        int product = 1;
        int largest = 0;
        int smallest = 0;
        int size = arr.length;

        largest = arr[size-1];
        smallest = arr[size-5];
        for (int i = 0; i<5; i++) {
            sum += arr[i];
            product *=  arr[i];
        }




        // Print out the sum
        System.out.println("Sum: " + sum);
        // Print out the sum
        System.out.println("Product : " + product);
        // Print out the sum
        System.out.println("Largest : " + largest);
        // Print out the sum
        System.out.println("Smallest : " + smallest);
    }
}
