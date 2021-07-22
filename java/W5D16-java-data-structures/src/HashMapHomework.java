import java.util.HashMap;
import java.util.Scanner;
//You are a car dealer - create a hash map of vehicles:
//
//The model is the Key, the make is the Value.
//
//Ask the customer what car (model) they are looking for,
//
//use the HashMap to determine if you have that vehicle, and what make it is.
//
//(e.g., "Oh, you're looking for a Civic? Our Honda selection is right over here...")
public class HashMapHomework {
    public static void main(String[] args) {
        HashMap<String, String> vehicle = new HashMap<>();
        vehicle.put("Toyota", "Sprinter Trueno AE86");
        vehicle.put("Subaru", "WRX STI Type R");
        vehicle.put("Nissan", "Skyline GT-R");
        vehicle.put("Mitsubishi", "Lancer Evo IV");
        vehicle.put("Honda", "Civic Type-R");


        System.out.println("Welcome to");
        System.out.println("==================================");
        System.out.println("");
        System.out.println("████████ ██    ██ ██       ██████  ██████  ███████     ██████  ██████  ██ ███████ ████████  ██████ ");
        System.out.println("   ██     ██  ██  ██      ██    ██ ██   ██ ██          ██   ██ ██   ██ ██ ██         ██    ██    ██ ");
        System.out.println("   ██      ████   ██      ██    ██ ██████  ███████     ██   ██ ██████  ██ █████      ██    ██    ██ ");
        System.out.println("   ██       ██    ██      ██    ██ ██   ██      ██     ██   ██ ██   ██ ██ ██         ██    ██    ██ ");
        System.out.println("   ██       ██    ███████  ██████  ██   ██ ███████     ██████  ██   ██ ██ ██         ██     ██████  ");
        System.out.println("");
        System.out.println("    ███████ ███    ███ ██████   ██████  ██████  ██ ██    ██ ███    ███ ");
        System.out.println("    ██      ████  ████ ██   ██ ██    ██ ██   ██ ██ ██    ██ ████  ████ ");
        System.out.println("    █████   ██ ████ ██ ██████  ██    ██ ██████  ██ ██    ██ ██ ████ ██ ");
        System.out.println("    ██      ██  ██  ██ ██      ██    ██ ██   ██ ██ ██    ██ ██  ██  ██ ");
        System.out.println("    ███████ ██      ██ ██       ██████  ██   ██ ██  ██████  ██      ██ ");
        System.out.println("");
        System.out.println("==================================");
        System.out.println("Take a look at some of my fine wares");
        System.out.println(vehicle);

        Scanner userInput = new Scanner(System.in);
        // get user input and search the hashmap
        System.out.println("What kind of vehiclular unit peeks your interest?");
        String test = userInput.nextLine();

        System.out.printf("I see you are interested in the %s", test);

        System.out.printf("I aint got no %s's here", test);


    }
    }
