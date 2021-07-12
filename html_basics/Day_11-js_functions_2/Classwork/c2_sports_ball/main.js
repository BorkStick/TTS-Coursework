let players = [
	{firstName: 'Cam', lastName: 'Newton', position: 'QB', touchdowns: 32},
	{firstName: 'Derek', lastName: 'Anderson', position: 'QB', touchdowns: 0},
	{firstName: 'Jonathan', lastName: 'Stewart', position: 'RB', touchdowns: 12},
	{firstName: 'Mike', lastName: 'Tolbert', position: 'RB', touchdowns: 8},
	{firstName: 'Fozzy', lastName: 'Whittaker', position: 'RB', touchdowns: 3},
	{firstName: 'Ted', lastName: 'Ginn', position: 'WR', touchdowns: 9},
	{firstName: 'Devin', lastName: 'Funchess', position: 'WR', touchdowns: 2}
];


let playerMike = players.find(function (player) {
    return player.firstName === "Mike";
});

console.log("should be mike");
console.log(playerMike);

let allTheRbs = players.filter(function (player) {
    return player.position === "RB";
});

console.log("RBs:");
console.log(allTheRbs);

let lastName = players.map( function (player) {
    return player.lastName;
});

console.log("Last Name:");
console.log(lastName);

