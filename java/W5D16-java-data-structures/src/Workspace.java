import java.util.*;

public class Workspace {
    public static void main(String[] args) {
        String[] arr = {"John", "Steve", "Jill"};
        System.out.println(arr.length);

        //Create a new string
        String myString = "I really love icecream!";

//Create another string that holds the split version of the first
        String str[] = myString.split(" ");

//Use the List class to create a new ArrayList
        List<String> arrayString = new ArrayList<String>();

//Store the contents of our split string as elements in
//arrayString using the Array.asList to convert the string into an array
        arrayString = Arrays.asList(str);

        System.out.println(myString);

        //Creates a HashMap with a String as key and Integer as the value it points to
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Pizza");
        map.put(2, "Pineapple");
        map.put(3, "Burger");

        System.out.println(map.get(1));
        ArrayList<String> array = new ArrayList<>();
        array.add("Honda");
        array.add("Toyota");
        array.add("Ford");
        for(String car: array){
            System.out.println(car);
        }

    }
}
