import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 200;
        int y = 25;
        System.out.println("addNumbers");
        Calculator.addNumbers(x, y);

        System.out.println("subtractNumbers");
        Calculator.subtractNumbers(x, y);

        System.out.println("multiplyNumbers");
        Calculator.multiplyNumbers(x, y);

        System.out.println("divideNumbers");
        Calculator.divideNumbers(x, y);

        System.out.println("squareNumbers");
        Calculator.squareNumber(x);
    }
    }
