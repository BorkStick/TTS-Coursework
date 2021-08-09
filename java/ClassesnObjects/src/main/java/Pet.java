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

    public String getName(){
        return name;
    }

}



