public class Hamburger implements Eatable {

    @Override
    public void getsAte() {
        System.out.println("Hamburger has been eaten");
    }

    @Override
    public void setUpCondiments(String condements) {
        System.out.println("Added the following to my hamburger" + condements);
    }
}
