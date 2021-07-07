let hands = ["rock", "paper", "scissors"]

function getComputerHand() {
    return hands[parseInt(Math.random()*10) % 3];
}


function compare(choice1, choice2){ 
	console.log("hand1: " + choice1);
  console.log("hand2: " + choice2);
  
  if (choice1 == choice2){
		return "Tie!";
  }
  if (choice1 == "rock"){
		if (choice2 == "paper"){
    	return "Player Won!";
		}
    else{
    	return "Computer Won!";
    }
  }
  else if (choice1 == "paper"){
  	if (choice2 == "scissors"){
    	return "Player Won!";
    }
    else{
    	return "Computer Won!";
    }
  }
  else if (choice1 == "scissors"){
  	if (choice2 == "rock"){
    	return "Player Won!"
    }
    else{
    	return "Computer Won!"
    }
  }
}

let choice1 = getComputerHand(); // computer's choice
let choice2 = hands[2]; // our choice
let game_result = compare(choice1, choice2); // get the result
 
console.log(game_result); // log the result




const player1 = document.getElementById("hand1");
player1.innerHTML = choice1;


const player2 = document.getElementById("hand2");
player2.innerHTML = choice2;

const winner = document.getElementById("winner");
winner.innerHTML = game_result;