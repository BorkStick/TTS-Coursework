package eatable;

import eatable.Eatable;

public class Taco implements Eatable {
    @Override
    public void getsAte() {
        System.out.println("eatable.Taco has been eaten");
    }

    @Override
    public void setUpCondiments(String condements) {
        System.out.println("Added the following to my taco" + condements);
    }

}
