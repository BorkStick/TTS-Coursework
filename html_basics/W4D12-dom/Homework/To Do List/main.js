//! Show an unordered list of to do's 
//! Show an input to enter a new to do 
//! Show a button to add a to  do. When the button is clicked: 
//! The text from the input box is used to add a list item to the bottom of the list 
//! The text from the input box is cleared out.
//! When the user clicks on a list item, it is removed

//Extra Credit: - When a list item is clicked, cross it out, then remove it after 1 second.

const form = document.getElementById('form')
const input = document.getElementById('input')
const todoUL = document.getElementById('todos')

// listens for form submit and will not refresh the page
// uses addTodo function to take text and make new list item
form.addEventListener('submit', (e) => {
    e.preventDefault()

    addTodo()
})

function addTodo(todo) {
    //get text input from the input form 
    let todoText = input.value

    if (todo) {
        todoText = todo.text
    }
    console.log(todoText);
    if (todoText) {
        const todoElement = document.createElement('li')
        if (todo && todo.completed) {
            todoElement.classList.add('completed')
        }

        todoElement.innerText = todoText

        //toggle completed class to todo element on click 
        todoElement.addEventListener('click', () => todoElement.classList.toggle('completed'))

        //remove item when todo element is right cliked  
        todoElement.addEventListener('contextmenu', (e) => {
            // disable the right click menue from poping up 
            e.preventDefault()
            todoElement.remove()
        })

        // add input text to dom 
        todoUL.appendChild(todoElement)
        // clear the input box after todo element added to list
        input.value = ''
    }
}