//Show an unordered list of to do's 
//Show an input to enter a new to do 
//Show a button to add a to  do. When the button is clicked: 
//The text from the input box is used to add a list item to the bottom of the list 
//The text from the input box is cleared out.
//When the user clicks on a list item, it is removed

//Extra Credit: - When a list item is clicked, cross it out, then remove it after 1 second.

let todoInput = document.getElementById("todoInput")
let addButton = document.getElementById("addButton");
let todoList = document.getElementById("todoList");

let todoListItems = ["Red", "Green", "Blue"]

console.log(todoListItems);

addButton.addEventListener("click", addItem);






// function for adding items to the todo list
function addItem(e, text) {
    //
    let newListItem = document.createElement("li");
    // set input text to the inner text of the <li>
    newListItem.innerText = text;
    // add class to new list item
    newListItem.classList.add("list-group-item")
    if (!text) {
        // set inner text of new list item ("li") to the text in input feild
        newListItem.innerText = todoInput.value;
        // clear the input box
        todoInput.value = "";
    }
    todoList.appendChild(newListItem);

}


// function for removing the todo list items
function removeItem() {

}