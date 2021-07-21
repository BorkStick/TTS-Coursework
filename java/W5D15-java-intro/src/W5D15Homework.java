//Create a small program that defines some fields.
// - Try creating some illegal field names and see what kind of error the compiler produces.
// - Use the naming rules and conventions as a guide. In the program you created, try leaving the fields uninitialized and print out their values.
// - Try the same with a local variable and see what kind of compiler errors you can produce.
// - Becoming familiar with common compiler errors will make it easier to recognize bugs in your code.

public class W5D15Homework {
    public static void main(String[] args) {
        String hostname = "computer-name";
        String test;

        double radius = 15.4;

        test = "This is a test";



        // camel case
        int thisIsCamelCase;

        thisIsCamelCase = 2;

        // snake case
        boolean this_is_snake_case;
        // pascal case
        int EverythingStartsWithACap;



        System.out.println(hostname);
        System.out.println(test);
        System.out.println("radius " + radius);
        System.out.println(thisIsCamelCase);


    }
}
