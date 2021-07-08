console.log("test");

function add(number1, number2) {
    return number1 + number2;
}

function doMath(operation, number1, number2) {
    return operation(number1, number2)
}

let sum = doMath(add, 1, 2);
console.log(sum);

