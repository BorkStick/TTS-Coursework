let billAmount = 102;

function gratuity() {
    return (billAmount * 0.2).toFixed(2);
}

console.log("Gratuity is: " + gratuity());

function totalWithGrat() {
    return parseFloat(billAmount + gratuity(billAmount)).toFixed(2);

    
}

console.log("Bill amount: " + totalWithGrat());
console.log("Your total including gratuity is:" + totalWithGrat() );

const gratuityAmount = document.getElementById("gratuity");
gratuityAmount.innerHTML = gratuity();




const total = document.getElementById("total");
total.innerHTML = totalWithGrat();