console.log("script loaded");

let teachers = ['Shane', 'Zach', 'Steve', 'Terry'];
teachers[4] = 'Mr Fivo'

teachers.push('Josh')

let teacher1 = teachers.pop();

console.log(teachers.length);
console.log(teachers);
console.log("the new teacher is: " + teacher1);

console.log("Index of Terry is " + teachers.indexOf('Terry'));

teachers.unshift("Bill")
teachers.unshift("Terry")



let teacherSlice = teachers.slice(2,4);
console.log("Teacher Slice is " + teacherSlice);


let teachersSplice = teachers.splice(0,3,'mike')
console.log("teachers splice is " + teachersSplice);

let numberOfTerry = 0;
let indexOfTerry = [];
for (let i = 0; i < teachers.length; i++) {
    if (teachers[i] === "Terry") {
        numberOfTerry++;
        indexOfTerry.push(i);
    }
}


console.log("Number of Terrys: " + numberOfTerry);
console.log("Number of Terrys: " + indexOfTerry);


console.log(teachers);
document.getElementById("p1").innerHTML =  teachers;




let numbers = [14, 1, 10, 15, 20] 
console.log(numbers);
numbers.sort(); //[1,2,3]
console.log("sort: " + numbers);

numbers.reverse(); //[3,2,1]
console.log("reverse: " + numbers);





let course2 = {
	name: 'JavaScript Applications',
	awesome: true,
	teachers: ['Assaf', 'Shane'],
	students: [
		{
			name: 'Steve',
			computer: {
				OS: 'Linux',
				type: 'laptop'
			}
		}
	]
};

console.log(course2.students[0].computer.OS);