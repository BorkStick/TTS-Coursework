public class Main {
    public static void main(String[] args) {
        Pet dogo = new Pet("dogo", 2, "The Couch", "Dog");

        System.out.println(dogo.getPetName());
        System.out.println(dogo.getPetAge());
        System.out.println(dogo.getPetLocation());
        System.out.println(dogo.getPetType());

    }
}
