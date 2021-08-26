//Now that you have 6 or 7 pieces of information it's time to generate the lottery numbers.  The output will 5 random numbers between 1 and 65, and the "magic ball" between 1 and 75.
//To accomplish this you should have 3 random integers, generated in the same way as in the previous exercises.  You may also want to declare constants for the max values of each set of of numbers.
//
//Generate the "magic ball" first.  It should be the user's favorite quarterback jersey number *or* their lucky number, multiplied by one of the random numbers.  Make sure that the answer is less the max "magic" number of 75; if it is greater than 75 then subtract 75 from the value and that value is now the "magic ball" number.
//
//For the 5 non-magic numbers use your choice of any of the following methods to generate values: (Note that you may have to adjust each value to correct range by adding/subtracting.)
//* Find the 3rd letter of their favorite pet.  Convert that character value to an integer value.
//* Use the two digit model year of their car and add their lucky number to it.
//* Use the random number between 1 and 50, subtracting one of the generated random numbers.
//* Convert the first letter of their favorite actor/actress to an integer and use that value.
//* Convert the last letter of their favorate actor/actress to an integer and use that value.
//* Use the value 42.
//* Use the age of their favorite pet + their car model year.
//* Favorite quarterback number + age of pet + lucky number.
//
//Once all the numbers have been calculated, print them out in this form:
//
//Lottery numbers: 4, 17, 15, 52, 26  Magic ball: 22
//




public class Survey {

    public static boolean carIsRed;
    public static String favoritePet;
    public static int ageOfPet;
    public static int luckyNum;
    public static int QB;
    public static boolean hasQB;
    public static int modelYear;
    public static String actor;
    public static int randNum;


    public static void start() {
        carIsRed = q1();
        favoritePet = q2();
        ageOfPet = q3(favoritePet);
        luckyNum = q4();
        System.out.println("Do you have a favorite quarterback? y|n");
        String response = Main.scan.next();
        response = response.toLowerCase();
        if (response.equals("y")) {
            QB = q5();
            hasQB = true;
        } else {
            QB = 0;
            hasQB = false;
        }
        modelYear = q6();
        actor = q7();
        randNum = q8();

        output();

    }

    // Ask the user if car red.
    static boolean q1() {
        boolean valid;

        do {
            System.out.println("Do you have a red car? (y|n)");
            String redCar = Main.scan.next();
            redCar = redCar.toLowerCase();

            switch (redCar) {
                case "y" -> {
                    return true;
                }
                case "n" -> {
                    return false;
                }
                default -> {
                    valid = false;
                }
            }

            if (!valid) System.out.println("Invalid response.");
        } while (!valid);

        return false;
    }

    // Ask the user for the name of their favorite pet.
    static String q2() {
        System.out.println("What is the name of your favorite pet?");
        Main.scan.nextLine();
        return Main.scan.nextLine();
    }

    // Ask the user for the age of their favorite pet.
    static int q3(String name) {
        System.out.println("How old is " + name);
        return Main.scan.nextInt();
    }

    // What is their lucky number?
    static int q4() {
        System.out.println("What is your lucky number?");
        return Main.scan.nextInt();
    }

    // Do they have a favorite quarterback?  If so what is their jersey number?
    static int q5() {
        System.out.println("What is their number?");
        return Main.scan.nextInt();
    }

    // What is two-digit model year of their car?
    static int q6() {
        boolean valid = false;
        do {
            System.out.println("What are the last two digits of your car's model year");
            int modelYear = Main.scan.nextInt();
            if (modelYear >= 0 && modelYear < 99) {
                return modelYear;
            } else {
                System.out.println("Invalid Response.");
            }
        } while (!valid);
        return 0;
    }

    // What is the first name of their favorite actor or actress?
    static String q7() {
        System.out.println("What is the first name of you favorite actor or actress?");
        return Main.scan.next();
    }

    // Enter a random number between 1 and 50.
    static int q8() {
        boolean valid = false;
        do {
            System.out.println("Enter a random number between 1 and 50");
            int num = Main.scan.nextInt();
            if (num >= 0 && num < 50) {
                return num;
            } else {
                System.out.println("Invalid Response.");
            }
        } while (!valid);
        return 0;
    }

    static void output() {
        final int MAX_NUMBER = 42;
        final int MAX_MAGIC_NUMBER = 55;

        final int randOne = randomInt(1, 50);
        final int randTwo = randomInt(1, 50);


        int magicBall;

        if (hasQB) magicBall = (QB * randOne) % MAX_MAGIC_NUMBER;
        else magicBall = (luckyNum * randOne) % MAX_MAGIC_NUMBER;

        int numOne = ((int) favoritePet.charAt(2)) % MAX_NUMBER;
        int numTwo = (modelYear + luckyNum) % MAX_NUMBER;
        int numThree = (randNum - randTwo) % MAX_NUMBER;
        int numFour = ((int) actor.charAt(actor.length() - 1)) % MAX_NUMBER;
        int numFive = (QB + ageOfPet + luckyNum) % MAX_NUMBER;


        System.out.printf("Lottery Numbers: %o, %o, %o, %o, %o \n", numOne, numTwo, numThree, numFour, numFive);
        System.out.printf("Magic Ball: %o \n", magicBall);
    }

    static int randomInt(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min) + min);
    }

}
