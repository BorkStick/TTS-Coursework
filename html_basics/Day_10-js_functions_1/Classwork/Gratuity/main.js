let billAmount = 100;


// get bill total from form input
function enterBill() {
    let billAmount = document.getElementById("billAmountForm").value;
    document.getElementById("bill-amount").innerHTML = billAmount;
    //console.log("bill amount: " + billAmount);
}

console.log("bill amount: " + billAmount);


// figure out gratuity - 20%
function gratuity() {
    return (billAmount * 0.2);
}

console.log("Gratuity is: " + gratuity());

function totalWithGrat(amount) {
    return gratuity() + amount;
}


console.log("Bill amount: " + totalWithGrat());
console.log("Your total including gratuity is:" + `totalWithGrat(billAmount)`);



// add stuff to the frontend

// Bill 
const billTotal = document.getElementById("bill-amount");
billTotal.innerHTML = billAmount;

// gratuity 
const gratuityAmount = document.getElementById("gratuity");
gratuityAmount.innerHTML = gratuity();

//total 
const total = document.getElementById("total");
total.innerHTML = totalWithGrat(billAmount);