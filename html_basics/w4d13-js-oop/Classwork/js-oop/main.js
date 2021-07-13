class Fruit {
    constructor(name) {
        this.name = name;
    }
    speak = function () {
        console.log("I am a " + this.name);
    }
}

let apple = new Fruit("Apple")
let banan = new Fruit("Banana")

console.log("Our first fruit is a " + apple.name);
console.log("Our second fruit is a " + banan.name);


apple.speak();
banan.speak();