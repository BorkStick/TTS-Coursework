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