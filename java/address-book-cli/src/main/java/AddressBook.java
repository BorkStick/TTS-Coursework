import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class AddressBook {
    public static void main() {
        System.out.println("");
        System.out.println("");
        System.out.println("List Address");

    }

    public static void ReadFromFile(){
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("addressbook.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray addressList = (JSONArray) obj;
            System.out.println(addressList);

            //Iterate over employee array
            addressList.forEach( add -> parseAddressObject( (JSONObject) add ) );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void parseAddressObject(JSONObject address)
    {
        //Get address object within list
        JSONObject addressObject = (JSONObject) address.get("address");

        System.out.println("====================================");
        //Get address first name
        String firstName = (String) addressObject.get("firstName");
        System.out.println("First Name: " + firstName);

        //Get address last name
        String lastName = (String) addressObject.get("lastName");
        System.out.println("Last Name: " + lastName);

        //Get employee website name
        String phone = (String) addressObject.get("phone");
        System.out.println("Phone: " + phone);

        //Get employee website name
        String email = (String) addressObject.get("email");
        System.out.println("Email: " + email);

        System.out.println("====================================");
    }


    public static void AddToBook(String x) {

    }

}
