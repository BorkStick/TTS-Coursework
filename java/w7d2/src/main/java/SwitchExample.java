public class SwitchExample {
    public static void printShirtSize(char shirt)
    {
        String msg= " " ;
        switch(shirt)
        {
            case 's':
                msg= "Shirt is small";
                break;
            case 'm':
                msg= "Shirt is medium";
                break;
            case 'l':
                msg= "Shirt is large";
                break;
            case 'x':
                msg= "Shirt is Xtra large";
                break;
            default:
                msg= "Unknown shirt size";
                break;
        }
        System.out.println(msg);
    }


    public static void enhancedSwitch(char myChar) {

        switch (myChar) {
            case 'a' -> System.out.println("Case a was");
            case 'b' -> System.out.println("Case b was");
            case 'c' -> System.out.println("Case c was");


        }



    }

}
