

public class Main {
    public static void main(String[] args) {

        while (true) {
            MainMenu.StartMenu();
        }


    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }




}
