// // console.log("test");

// // function add(number1, number2) {
// //     return number1 + number2;
// // }

// // function doMath(operation, number1, number2) {
// //     return operation(number1, number2)
// // }

// // let sum = doMath(add, 1, 2);
// // console.log(sum);

// // let students = [
// //     {name: 'Terry Fromit', average: 90},
// //     {name: 'Mike Fromacc', average: 20},
// //     {name: 'Steve Sellit', average: 60}
// // ]

// // let passingStudents = students.filter(function(student) {
// //     return student.average > 50;
// // });

// // console.log(passingStudents);



// // // find
// // let firstPassingStudents = students.find(function(student) {
// //     return student.average > 50;
// // });

// // console.log(firstPassingStudents);



// // map
// let students2 = [
// 	{firstName: 'Cam', lastName: 'Newton'},
// 	{firstName: 'Ted', lastName: 'Ginn'},
// 	{firstName: 'Greg', lastName: 'Olsen'}
// ]
 
// let fullNames = students2.map(function(student){
// 	return `${student.firstName} ${student.lastName}`;
// })

// console.log(fullNames);

// let students = [
// 	{name: 'Cam Newton', assignmentsCompleted: 6},
// 	{name: 'Ted Ginn', assignmentsCompleted: 10},
// 	{name: 'Greg Olsen', assignmentsCompleted: 8}
// ]
 
// let totalAssignments = students.reduce(function(sum,current){
// 	return sum + current.assignmentsCompleted;
// }, 0);
 
// console.log(totalAssignments);

// let myButton = document.getElementById("myButton");

// myButton.addEventListener('click', function(){
// 	// alert('click');
// 	console.log("Clicked");
// })

let students = [
	{ name: "Edwin"}, 
	{ name: "Kim"}, 
	{ name: "Skip"}
  ];
  
  let names = students.map((student) => student.name);
  
  console.log(names);
  // ["Edwin","Kim","Skip"]