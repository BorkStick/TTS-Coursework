//name (PRIVATE)
//        age (PRIVATE)
//        location (PRIVATE)
//        type (PRIVATE)
//        two constructors(empty, all attributes)
//        Code to be able to access the following (Get Methods):
//        name, age, type
//        Code to be able to change (Set Methods):
//        name, age, location

// Pet class Method
public class Pet {


    private String name;
    private int age;
    private String location;
    private String type;

    public Pet() {

    }

    // Pet constructor
    public Pet(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }


    public String getPetName(){
        return name;
    }

    public int getPetAge() {
        return age;
    }

    public String getPetLocation() {
        return location;
    }

    public String getPetType() {
        return type;
    }

    public void setPetName(String name) {
        this.name = name;
    }

    public void setPetAge(int age) {
        this.age = age;
    }

    public void setPetLocation(String location) {
        this.location = location;
    }

    public void setPetType(String type) {
        this.type = type;
    }


    public static void main(String[] args) {
        Pet pet = new Pet("dogo", 2, "The Couch", "Dog");
        System.out.println(pet.getPetName());
        System.out.println(pet.getPetAge());
        System.out.println(pet.getPetLocation());
        System.out.println(pet.getPetType());

    }



}



