//Selecting Nodes

let list = document.getElementById("list")
// 1. Update the 'Coffee' item to say 'Fair Trade Coffee'
let coffeeItem = list.firstElementChild.nextElementSibling
console.log(coffeeItem);
coffeeItem.innerHTML = "Fair Trade Coffee"
// 2. Remove 'Twinkies' from the list
list.children[3].remove

// 3. Add an item 'Cheese Whiz'
let cheezeWiz = document.createElement("li")
cheezeWiz.innerHTML = "Cheeze Whiz"
list.appendChild(cheezeWiz)

// 4. Clear the list and programmatically add items from the array ['protein powder', 'muscle milk', 'power bars']
let newList = ['protein powder', 'muscle milk', 'power bars']
list.innerHTML = ""
newList.map(function (listItem) {
    let newItem = document.createElement("li")
    newItem.innerHTML = listItem
    list.appendChild(newItem)
})

// 5. Add the class 'important' to the muscle milk item.
let muscleMilk = list.firstElementChild.nextElementSibling
muscleMilk.classList += "important";