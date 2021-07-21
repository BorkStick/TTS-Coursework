import java.util.Scanner;
import java.util.*;

public class Exercises1 {
    public static void main(String[] args) {
        //Ask the user for 5 numbers and store them in an array list.
        //Then find the sum, product, largest, and smallest of those numbers.

        int[] arr=new int[5];
        int sum = 0;

        Scanner userInput = new Scanner(System.in);
        // get user input and add to array
        System.out.println("Enter numbers");
        //loop through 5 times and add input to array
        for(int i=0; i<5; i++)
            arr[i]=userInput.nextInt();

        // print out the numbers in the array
        System.out.println("These are the numbers you have entered: ");

        System.out.println("The numbers entered are: " + Arrays.toString(arr));








        //You are a car dealer - create a hash map of vehicles:
        //
        //The model is the Key, the make is the Value.
        //
        //Ask the customer what car (model) they are looking for,
        //
        //use the HashMap to determine if you have that vehicle, and what make it is.
        //
        //(e.g., "Oh, you're looking for a Civic? Our Honda selection is right over here...")
    }
}
