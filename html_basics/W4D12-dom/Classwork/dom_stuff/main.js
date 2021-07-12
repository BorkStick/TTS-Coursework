// //Get all inputs
// let inputs = document.getElementsByTagName('input');
// let inError = document.getElementsByClassName('error');

// console.log(inputs.length); //2
// console.log(inError.length); //1


//Get all inputs
let firstButton = document.querySelector('button');
let inError = document.querySelectorAll('input.error');

console.log(firstButton); //single button node
console.log(inError); //Node list of inputs with class 'error'



let listItems = document.querySelector('ul').children;
console.log("Number of list items:" + listItems.length); //2
console.log(listItems);


var a = document.querySelector('a');

//Get an attribute
console.log(a.href); //"http://google.com"

//Set an attribute
a.name = 'new link name';

//Add a new attribute
a.target = "_blank";



// dom events
let el = document.getElementById('myEl');
el.addEventListener('click', function (event) {
    alert('clicked!');
})

//Combine with DOM editing
el.addEventListener('mouseover', function (event) {
    el.innerHTML = ('mosue over');
})

el.addEventListener('mouseout', function (event) {
    el.innerHTML = ('test');
})

//event bubbling
document.querySelector('.outer').addEventListener('click', function(e){
    // e represents the event (element that has been clicked)
console.log(e.target, e.currentTarget);
//inner, outer
})