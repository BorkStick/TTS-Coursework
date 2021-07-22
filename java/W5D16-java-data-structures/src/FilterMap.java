import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.Scanner;



public class FilterMap {
    public static void main(String[] args) {
        Map<String, String> cityMap = new HashMap<>();

        cityMap.put("Tokyo", "Japan");
        cityMap.put("Berlin", "Germany");
        cityMap.put("Kyoto", "Japan");
        cityMap.put("Belgrade", "Serbia");
        cityMap.put("Madrid", "Spain");

        Scanner userInput = new Scanner(System.in);
        // get user input and search the hashmap
        System.out.println("What country?");
        String search = userInput.nextLine();

        Map<String, String> filteredMap = cityMap.entrySet()
                .stream().filter(x -> search.equals(x.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("Filtered map: " + filteredMap);
    }
}
