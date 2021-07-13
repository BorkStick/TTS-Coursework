class Fruit {
    fruitName = "fruit";
    howNutritious = "unknown";
    constructor(name) {
        this.fruitName = name;
    }

    changeName = function (newName) {
        this.fruitName = newName;
    };

    speak = function () {
        console.log("Hey my name is " + this.fruitName);
    };

    calculateNutrition = function () {
        if (this.fruitName === "Apple") {
            this.howNutritious = "very";
        } else if (this.fruitName === "Banana") {
            this.howNutritious = "pretty";
        } else {
            this.howNutritious = "not very";
        }
    };

    sayNutrition = function () {
        this.calculateNutrition();
        console.log(
            "This " + this.fruitName + " is " + this.howNutritious + " nutritious."
        );
    };
}

let apple = new Fruit("Apple")
let banan = new Fruit("Banana")
let candy = new Fruit("Candy")


apple.speak();
banan.speak();
banan.changeName("chicken")

apple.sayNutrition();
banan.sayNutrition();
candy.sayNutrition();