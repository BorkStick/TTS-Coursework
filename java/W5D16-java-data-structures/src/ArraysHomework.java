import java.util.Arrays;

public class ArraysHomework {
    static int[] myNum = {30, 10, 20, 40};


    static void sortArray(int [] array) {
        Arrays.sort(array);
        System.out.println("We sorted things: " + Arrays.toString(array));
    }

    // Write a program to sum all the values of a given Array in Java.
    static void sums(int [] array) {
        //do math and stuff

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("The sum of " + Arrays.toString(array) + " is " + sum);
    }

    // 2. What is the output?
    // java: illegal start of expression
    // fixed the errors in code and the output is 2
    static void numberTwo() {

        double[ ] exampleArray = {1,5,6,5,4,1};

        double maximum = exampleArray[0];

        int index = 0;

        for (int i = 1; i<exampleArray.length; i++){

            if (exampleArray[ i ] > maximum) {

                maximum = exampleArray[ i ];

                index = i;

            }

        }

        System.out.println(index);
    }

    //1. Write a public static method called "toPower" that takes in as parameters two integers called size and power.
    // The method should return an array of size "size" with each array index raised to the value of "power."
    // So, for example, if we passed in "size = 4" and "power = 2" to the "toPower," the method should return the following result: [0,1,4,9].
    static void toPower(int size, int power) {
        int base = size;
        int exponent = power;
        double result = Math.pow(base, exponent);
        System.out.println("size is: " + size);
        System.out.println("power is: " + power);
        System.out.println("result: " + result);


    }




    public static void main(String[] args) {



        System.out.println("Array numbers are: " + Arrays.toString(myNum));
        sortArray(myNum);
        sums(myNum);
        numberTwo();
        toPower(4, 2);
    }



     }

