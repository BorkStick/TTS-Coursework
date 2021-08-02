//! Write an asynchronous function and call it with async/await
// Write function called getRandomNumber that returns a promise
// In the promise, write a setTimeout() that will resolve the promise with a random number after .5 seconds
// Write an async function that invokes the getRandomNumber function, awaiting the random number, and printing that to the console.
// Invoke your async function



function getRandomNumber() {
    num = Math.floor(Math.random() * 100) + 1;
    console.log(num);
    setTimeout(function getRandomNumber() {
        console.log("0.5 seconds haave passed");
        document.getElementById('d20-output').innerHTML = num;
    }, 500);
}



//! Fetch remote data using async/await
// Write an asynchronous function that accepts 1 parameter
// A city name
// When invoked, this function should use geocode.xyz's API retrieve the city data, which uses a URL formatted as follows:
// https://geocode.xyz/seattle?json=1

// Once retrieved, print to the console the latitude and longitude
// Invoke your async function with a few cities as a test
// (Note: the API will only allow you 2 calls per second, so if you are getting errors and you think you shouldn't be, try calling fetching only ONCE per execution.)

var cityName = "austin";

console.log(cityName);
console.log(`https://geocode.xyz/${cityName}?json=1`);

fetch(`https://geocode.xyz/${cityName}?json=1`)
    .then((response) => response.json())
    .then((json) => {
    console.log(json)
    console.log(json.standard.city)
    document.getElementById('city-output').innerHTML = json.standard.city;
    console.log(json.standard.countryname)
    document.getElementById('country-output').innerHTML = json.standard.countryname;
    console.log("Latt: " + json.latt)
    document.getElementById('latt-output').innerHTML = json.latt;
    console.log("Long: " + json.longt)
    document.getElementById('long-output').innerHTML = json.longt;
    }
    );








async function showAvatar() {
    // read our json
    let response = await fetch('https://javascript.info/article/promise-chaining/user.json');

    let user = await response.json();

    // read github user
    let githubResponse = await fetch(`https://api.github.com/users/${user.name}`);
    let githubUser = await githubResponse.json();

    console.log(githubUser);

    // show the avatar
    let img = document.createElement("img");
    img.src = githubUser.avatar_url;

    img.className = "promise-avatar-example";
    document.body.append(img);


}

showAvatar();
showAvatar();
showAvatar();
showAvatar();