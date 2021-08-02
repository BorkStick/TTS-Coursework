console.log("starting timer");

//callback for displaying log after 2 senconds 
setTimeout(function afterTwoSeconds() {
    console.log("2 seconds haave passed");
})


// cleaning it up with an arrow function 
// runs after 5s
setTimeout(() => {
    console.log("This is shown after 5s");
}, 5000);

// adding callcack for button click
window.onload = function () {
    document.querySelector("#callback-btn")
        // listens for the button click then logs the message to console
        .addEventListener("click", function () {
            console.log("User has clicked on the button!");
        });
}

window.onload = function () {
    document.querySelector("#status-btn")
        // listens for the button click then logs the message to console
        .addEventListener("click", function () {
            console.log("User has clicked on the status button!");
            greet('Terry');
        });
}
	
setInterval(myClock, 1000);

function myClock() {
    let d = new Date();
    document.getElementById("clock").innerHTML =
        d.getHours() + ":" +
        d.getMinutes() + ":" +
        d.getSeconds();
}

let checkThisSite = "https://domain.com"
let siteStatus = "online"
document.getElementById("domain").innerHTML = checkThisSite;
document.getElementById("domainh").innerHTML = checkThisSite;
document.getElementById("domain-status").innerHTML = siteStatus;

function getDomain(event) {
    var x = document.getElementById("domain-input").value;
    document.getElementById("demo").innerHTML = "You selected: " + x;
   
  }

// check server status

// fetch from server 

// get response code

// use response codee to determin if offline or online 



function saySomethingNice() {
    console.log(`Nice to meet you.`);
}

function greet(name) {
    console.log(`Hello ${name}!`);
    saySomethingNice();
}


