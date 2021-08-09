// Create a Java Calculator Class that does the following five commands:
//


public class Calculator {



    // An add method that takes in two integer numbers and adds them together the call to that method would look like this: add(int num1, int num2)
    public static void addNumbers(int x, int y) {
        System.out.println(x + y);

}
    // A subtraction method that takes in two integers and subtracts them from one another would look like this: subtract( int num1, int num2)
    public static void subtractNumbers(int x, int y) {
        System.out.println(x - y);
}

    // A multiplication method that takes in two integer numbers and multiplies them together the call to that method would look like this: multiply(int num1, int num2)
    public static void multiplyNumbers(int x, int y) {
        System.out.println(x * y);
    }

    // A division method that takes in two integer numbers and divides them the call to that method would look like this: divide(int num1, int num2)
    public static void divideNumbers(int x, int y) {
        System.out.println(x / y);
    }

    // A square method that takes in one integer and squares it: square(int num1, int num2)
    public static void squareNumber(int x) {

        int squared = x * x;
        System.out.println(squared);
    }

}
